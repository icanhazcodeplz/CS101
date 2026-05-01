# CS101 Quiz 2 - Answers

**During Quiz:**
- NO NOTES

---

**1. (3pts) What will the following java code print to the terminal?**

```java
public class printStatements {
    public static void main(String[] args) {
        System.out.println("backslash:\\");
        System.out.println("quote:\"");
    }
}
```

- A) `backslash:\\` on line 1, `quote:\"` on line 2
- B) `backslash:` on line 1, `quote:` on line 2
- *answer* **C) `backslash:\` on line 1, `quote:"` on line 2**
- D) `backslash:\"` on line 1, `quote:\\` on line 2

> **Rationale:** `\\` is an escape sequence for a single backslash — it prints `\`, not `\\`. Similarly, `\"` is an escape sequence for a double quote — it prints `"`, not `\"`. Each `println` prints on its own line.

---

**2. (2pts) What is the binary number `0110` in decimal?**

- A) 3
- *answer* **B) 6**
- C) 8
- D) 10

> **Rationale:** Each binary digit represents a power of 2 from right to left: `0110` = (0×8) + (1×4) + (1×2) + (0×1) = 0 + 4 + 2 + 0 = **6**.

---

**3. (2pts) What is the minimum number of binary digits needed to represent all of the months of the year?**

- A) 3
- *answer* **B) 4**
- C) 5
- D) 12

> **Rationale:** 3 bits gives 2³ = 8 combinations — not enough for 12 months. 4 bits gives 2⁴ = 16 combinations, which is enough to represent all 12 months. So the minimum is **4**.

---

**4. (1pt) What color is `(0, 255, 0)` in RGB?**

- A) White
- B) Red
- *answer* **C) Green**
- D) Blue

> **Rationale:** In RGB, the three values represent Red, Green, and Blue channels. `(0, 255, 0)` has zero red, maximum green, and zero blue — producing pure **green**.

---

**5. (2pts) What is a Graphical User Interface (GUI)?**

- A) A text-based interface for typing commands directly to the shell
- B) The core part of the operating system that directly manages hardware and memory
- *answer* **C) A visual interface with windows, icons, and menus that users interact with using a mouse or touch**
- D) A programming language used to create software applications

> **Rationale:** A GUI (like Windows or macOS) lets users interact with a computer visually through icons, windows, and menus. A describes a terminal/shell, B describes a kernel, and D describes a programming language.

---
