"""
Convert a Markdown file to a styled PDF with syntax-highlighted code blocks.

Usage:
    python utils/md_to_pdf.py <input.md> [output.pdf]

If output.pdf is omitted, it writes to the same directory as the input with a .pdf extension.

Requirements:
    pip install markdown pygments weasyprint
    brew install glib pango cairo (macOS)
"""

import sys
import os
import re
import subprocess
import markdown
from pygments.formatters import HtmlFormatter

def md_to_pdf(input_path, output_path=None):
    if output_path is None:
        output_path = os.path.splitext(input_path)[0] + ".pdf"

    with open(input_path, "r") as f:
        md_text = f.read()

    # Add markdown="block" to HTML table tags so md_in_html processes
    # markdown content (headings, code blocks) inside table cells
    md_text = re.sub(r'<(td|tr|table|th)(?![^>]*markdown=)', r'<\1 markdown="block"', md_text)

    # Convert markdown to HTML with syntax highlighting and tables
    html_body = markdown.markdown(
        md_text,
        extensions=["fenced_code", "codehilite", "tables", "md_in_html"],
        extension_configs={
            "codehilite": {
                "guess_lang": False,
                "css_class": "codehilite",
            }
        },
    )

    # Get Pygments CSS for syntax highlighting
    code_css = HtmlFormatter(style="friendly").get_style_defs(".codehilite")

    html = f"""<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style>
    @page {{
        margin: 0.4in;
    }}
    body {{
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        font-size: 14px;
        line-height: 1.5;
        margin: 0;
        color: #333;
    }}
    h3 {{
        margin-top: 0.5em;
        margin-bottom: 0.3em;
    }}
    hr {{
        border: none;
        border-top: 1px solid #ccc;
        margin: 1em 0;
    }}
    .codehilite {{
        background: #f0f0f0;
        padding: 8px 12px;
        border-radius: 4px;
        font-size: 13px;
        overflow-x: auto;
    }}
    .codehilite pre {{
        margin: 0;
    }}
    code {{
        font-family: "Menlo", "Consolas", "Courier New", monospace;
        font-size: 13px;
    }}
    p code {{
        background: #f0f0f0;
        padding: 2px 4px;
        border-radius: 3px;
    }}
    ul {{
        margin-top: 0.3em;
    }}
    table {{
        border-collapse: collapse;
        width: 100%;
    }}
    td {{
        vertical-align: top;
        padding: 8px;
    }}
    {code_css}
</style>
</head>
<body>
{html_body}
</body>
</html>"""

    # Set library path so weasyprint can find brew-installed libs
    brew_prefix = subprocess.check_output(["brew", "--prefix"]).decode().strip()
    os.environ["DYLD_LIBRARY_PATH"] = f"{brew_prefix}/lib"

    import weasyprint
    weasyprint.HTML(string=html).write_pdf(output_path)
    print(f"Created: {output_path}")


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python md_to_pdf.py <input.md> [output.pdf]")
        sys.exit(1)

    input_file = sys.argv[1]
    output_file = sys.argv[2] if len(sys.argv) > 2 else None
    md_to_pdf(input_file, output_file)