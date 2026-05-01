# CS101 Quiz 1 - Practice - Answers

**Covers**:
- File System Structure
- CLI Basics
- Any word on the CS101 Github `vocabulary.md` file
- Slides "1/20-Computer-Hardware"

**During Quiz:**
- NO NOTES
- Yes → Bash CLI Commands Cheatsheet

---

**Use the file system diagram below to answer questions 1 - 2:**

```
home
├── school
└── cs101
    ├── lab1
    │   ├── shell.sh
    │   └── .config.txt
    └── notes.txt
```

**1. (2pts) What directory is the *child* of folder `cs101`?**

- A) `home`
- B) `school`
- C) `notes.txt`
- *answer* **D) `lab1`**

> **Rationale:** `cs101` has two children in the tree: `lab1` (a directory) and `notes.txt` (a file). The question asks for the directory child, which is `lab1`. `home` is the parent of `cs101`, and `school` is a sibling.

---

**2. (2pts) My working directory is `/home/cs101/lab1`. What command prints all files in the `lab1` folder?**

- A) `mkdir lab1`
- B) `cd lab1`
- *answer* **C) `ls -a`**
- D) `ls`

> **Rationale:** `ls` lists files in the current directory. The `-a` flag shows **all** files, including hidden ones (those starting with `.`, like `.config.txt`). Since you're already in `lab1`, no path argument is needed. `mkdir` creates directories, `cd` changes directory, and `pwd` prints the working directory path.

---

**3. (2pts) Which correctly identifies the command, options, and arguments in `$ eat -h -g --now carrots apples`?**

- A) Command: `eat`, Options: `carrots apples`, Arguments: `-h -g --now`
- B) Command: `eat -h`, Options: `-g --now`, Arguments: `carrots apples`
- C) Command: `-h`, Options: `-g --now eat`, Arguments: `carrots apples`
- *answer* **D) Command: `eat`, Options: `-h -g --now`, Arguments: `carrots apples`**

> **Rationale:** The **command** is always the first word (`eat`). **Options** start with one or two dashes and modify how the command runs — `-h`, `-g`, and `--now` are all options (short flags use `-`, long flags use `--`). **Arguments** are the plain inputs the command acts on — `carrots` and `apples`.

---

**4. (2pts) A **GB** is about how many Bytes?**

- A) Thousand
- B) Million
- *answer* **C) Billion**
- D) Trillion

> **Rationale:** Storage prefixes: Kilo ≈ thousand, Mega ≈ million, **Giga ≈ billion**, Tera ≈ trillion. So 1 GB ≈ 1,000,000,000 bytes.

---

**5. (2pts) What does **SSD** stand for?**

- A) System Storage Disk
- B) Secondary Storage Device
- *answer* **C) Solid State Drive**
- D) Solid Storage Disk

> **Rationale:** SSD stands for Solid State Drive. Unlike traditional hard drives (HDDs) which use spinning magnetic platters, SSDs store data on flash memory chips with no moving parts — making them faster and more durable.

---
