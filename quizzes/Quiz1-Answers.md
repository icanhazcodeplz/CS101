# CS101 Quiz 1 - Answers

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

**1. (2pts) What directory is the *parent* of folder `lab1`?**

- A) `home`
- B) `school`
- *answer* **C) `cs101`**
- D) `lab1`

> **Rationale:** In the file system tree, `lab1` is directly beneath `cs101`. A parent directory is the folder immediately above a given item — that's `cs101`. `home` is two levels up (a grandparent), and a folder cannot be its own parent.

---

**2. (2pts) In a terminal, how do I create a new directory called `lab2`?**

- A) `cd lab2`
- B) `touch lab2`
- C) `ls lab2`
- *answer* **D) `mkdir lab2`**

> **Rationale:** `mkdir` (make directory) creates a new folder. `cd` changes your working directory, `touch` creates a new empty file, and `ls` lists the contents of a directory.

---

**3. (2pts) Which correctly identifies the command, option, and argument in `$ rm -r lab1`?**

- A) Command: `rm`, Option: `lab1`, Argument: `-r`
- B) Command: `-r`, Option: `rm`, Argument: `lab1`
- *answer* **C) Command: `rm`, Option: `-r`, Argument: `lab1`**
- D) Command: `rm -r`, Option: none, Argument: `lab1`

> **Rationale:** In a CLI command, the **command** is the first word (`rm`). **Options** (also called flags) start with a dash and modify behavior (`-r` means recursive). **Arguments** are the inputs the command acts on (`lab1` is the directory being removed).

---

**4. (2pts) A **TB** is about how many Bytes?**

- A) Thousand
- B) Million
- C) Billion
- *answer* **D) Trillion**

> **Rationale:** Storage prefixes: Kilo ≈ thousand, Mega ≈ million, Giga ≈ billion, **Tera ≈ trillion**. So 1 TB ≈ 1,000,000,000,000 bytes.

---

**5. (2pts) What does **RAM** stand for?**

- A) Rapid Access Module
- B) Read-only Access Memory
- C) Random Allocation Method
- *answer* **D) Random Access Memory**

> **Rationale:** RAM (Random Access Memory) is your computer's short-term, fast-access memory used to hold data while programs are running. "Random access" means any memory location can be read or written in roughly the same amount of time, regardless of its address.

---
