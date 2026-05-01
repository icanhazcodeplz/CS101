# CS101 Quiz 2 - Practice - Answers

**Covers**:
- Anything From **Lab2-java_print_statements**
  - Study Alex Lee videos #2, #3, #4
- 4-digit Binary to decimal conversion
- RGB Basics
- Any word on the CS101 Github `vocabulary.md` file

**During Quiz:**
- NO NOTES

---

**1. (3pts) What will the following java code print to the terminal?**

```java
public class printStatements {
    public static void main(String[] args) {
        System.out.println("They\n Said\n\"Hi!\"");
    }
}
```

- A) `They\n Said\n\"Hi!\"` (all on one line)
- B) `They` on line 1, `Said` on line 2, `Hi!` on line 3
- *answer* **C) `They` on line 1, ` Said` on line 2, `"Hi!"` on line 3**
- D) `They` on line 1, ` Said` on line 2, `\"Hi!\"` on line 3

> **Rationale:** `\n` is a newline escape sequence — it moves output to the next line. `\"` is an escaped double quote — it prints `"`. The string contains two `\n` characters, producing three lines: `They`, ` Said` (note the leading space), and `"Hi!"`.

---

**2. (2pts) What is the binary number `1011` in decimal?**

- A) 5
- B) 7
- *answer* **C) 11**
- D) 13

> **Rationale:** `1011` = (1×8) + (0×4) + (1×2) + (1×1) = 8 + 0 + 2 + 1 = **11**.

---

**3. (2pts) What is the minimum number of binary digits needed to represent all the outcomes of rolling a 6-sided die?**

- A) 2
- *answer* **B) 3**
- C) 4
- D) 6

> **Rationale:** 2 bits gives 2² = 4 combinations — not enough for 6 outcomes. 3 bits gives 2³ = 8 combinations, which is enough to represent all 6 faces of the die. So the minimum is **3**.

---

**4. (1pt) What color is `(255, 255, 255)` in RGB?**

- *answer* **A) White**
- B) Black
- C) Gray
- D) Blue

> **Rationale:** In RGB, `(255, 255, 255)` has all three channels (Red, Green, Blue) at their maximum value. Maximum red + green + blue combined produces **white**. The opposite, `(0, 0, 0)`, would be black.

---

**5. (2pts) What is the definition of "Kernel"?**

- A) Text-based interface for typing commands directly to the shell
- *answer* **B) Core part of the operating system that directly manages hardware, memory, and processes**
- C) Visual interface with windows, icons, and menus that users interact with using a mouse/touch
- D) Main circuit board that connects all computer components together

> **Rationale:** The kernel is the core of the OS — it sits between software and hardware, managing memory, processes, and device communication. A describes a terminal/shell, C describes a GUI, and D describes a motherboard.

---
