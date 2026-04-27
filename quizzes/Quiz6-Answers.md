# CS101 Quiz 6 - Answers
### Covers:
 - Boolean logic
 - If / else if / else (Lab5)
 - Basic for loops (Lab7)
 - Basic while loops (Lab8)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - No Notes
 - Will have printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. (1pt) What is the value of `result`?**
```java
boolean a = true;
boolean b = false;
boolean c = true;
boolean result = a && b && c;
```
- A) `true`
- *answer* **B) `false`**
- C) `"false"`
- D) Compiler error

> **Rationale:** `&&` requires all operands to be true. Since `b` is `false`, the entire expression is `false`.

---

**2. (1pt) What is the value of `result`?**
```java
boolean x = false;
boolean y = false;
boolean result = !(x || y);
```
- *answer* **A) `true`**
- B) `false`
- C) `!true`
- D) Compiler error

> **Rationale:** `false || false` is `false`, and `!false` is `true`.

---


**3. (2pts) What is the value of `result`?**
```java
int x = 4;
boolean result = (7 > 3) && (x < 2) || !(x == 5);
```
- *answer* **A) `true`**
- B) `false`
- C) `4`
- D) Compiler error

> **Rationale:** `&&` has higher precedence than `||`. `(7>3) && (4<2)` = `true && false` = `false`. `!(4==5)` = `!false` = `true`. `false || true` = `true`.

---

**4. (2pts) What does this code print?**
```java
int score = 15;
if (score >= 20) {
    System.out.print("a ");
} else if (score < 15) {
    System.out.print("b ");
} else if (score <= 15) {
    System.out.print("c ");
} else {
    System.out.print("d ");
}
```
- A) `b`
- B) `b d`
- *answer* **C) `c`**
- D) `c d`

> **Rationale:** `15 >= 20` is false. `15 < 15` is false. `15 <= 15` is true, so `"c "` is printed and the chain exits.

---

**5. (2pts) What does this code print?**
```java
boolean isCold = false;
boolean hasJacket = true;
if (isCold && hasJacket) {
    System.out.println("Stay warm");
} else if (isCold && !hasJacket) {
    System.out.println("Get chilly");
} else {
    System.out.println("Not cold");
}
```
- A) `Stay warm`
- B) `Get chilly`
- *answer* **C) `Not cold`**
- D) `Stay warm` and `Get chilly`

> **Rationale:** `false && true` = `false` (first branch skipped). `false && false` = `false` (second branch skipped). Falls through to else: `"Not cold"`.

---

**6. (2pts) What does this code print?**
```java
for (int i = 1; i <= 4; i++) {
    System.out.print(i + " ");
}
```
- A) `1 2 3 `
- B) `0 1 2 3 `
- *answer* **C) `1 2 3 4 `**
- D) `0 1 2 3 4`

> **Rationale:** The loop starts at `i = 1` and runs while `i <= 4`, printing 1, 2, 3, 4. When `i` becomes 5, the condition is false and the loop stops.

---


**7. (1pt) Define "semiconductor":**

- A) A wire that connects two computers together
- B) A type of vacuum tube used in early computers
- C) A programming language used to control hardware
- *answer* **D) A material that can sometimes conduct electricity and sometimes resist it, used as the basis for transistors**

> **Rationale:** Semiconductors (like silicon) have controllable conductivity. This property makes transistors — and therefore all modern computer chips — possible.

---
