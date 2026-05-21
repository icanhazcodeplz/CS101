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
import argparse
import subprocess
import markdown
from pygments.formatters import HtmlFormatter

def md_to_pdf(input_path, output_path=None, linenums=False):
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
                "linenums": linenums,
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
        size: letter;
        margin: 0.3in;
    }}
    body {{
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        font-size: 13px;
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
    p {{
        margin-bottom: 0.2em;
    }}
    .codehilite {{
        background: #f0f0f0;
        padding: 1px 2px;
        border-radius: 2px;
        font-size: 12px;
        overflow-x: auto;
        margin-top: 0.2em;
        max-width: 50%;
    }}
    .codehilite pre {{
        margin: 0;
    }}
    code {{
        font-family: "Menlo", "Consolas", "Courier New", monospace;
        font-size: 12px;
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
        margin-top: -0.5em;
        margin-bottom: 2.0em;
    }}
    td {{
        vertical-align: top;
        padding: 6px;
    }}
    .codehilite table {{
        width: auto;
        margin: 0;
        border: none;
    }}
    .codehilite td {{
        padding: 0;
        border: none;
    }}
    td.linenos pre {{
        color: #aaa;
        padding: 1px 8px 1px 4px;
        border-right: 1px solid #ddd;
        margin: 0;
        font-size: 12px;
    }}
    td.code {{
        padding-left: 8px;
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
    parser = argparse.ArgumentParser(description="Convert a Markdown file to a styled PDF.")
    parser.add_argument("input", help="Input .md file")
    parser.add_argument("output", nargs="?", default=None, help="Output .pdf file (default: same name as input)")
    parser.add_argument("-l", action="store_true", help="Show line numbers in code blocks")
    args = parser.parse_args()
    md_to_pdf(args.input, args.output, linenums=args.l)