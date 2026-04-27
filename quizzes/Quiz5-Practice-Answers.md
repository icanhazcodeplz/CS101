# CS101 Quiz 5 - Practice - Answers
There are 12 points available. The grade will be out of 10 (thus 2 EC points possible)
### Covers:
 - Anything from [**Lab 5 - Booleans - Conditionals**](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab5_booleans_conditionals/lab5_booleans_conditionals_writeup.md)
 - Any problem from [**Java Order of Operations Worksheet**](https://github.com/icanhazcodeplz/CS101/tree/main/worksheets)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - No Notes
 - Will have printed version of [Java Order of Operations](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/order_of_ops_ifElse_cheatsheet.md)


---

**1. (1pt) What is the value of `result`?**
```java
boolean a = true;
boolean b = false;
boolean result = a && b;
```
- A) `true`
- *answer* **B) `false`**
- C) `"true"`
- D) Compiler error

> **Rationale:** `&&` (AND) requires both operands to be true. Since `b` is `false`, `a && b` is `false`.

---

**2. (1pt) What is the value of `result`?**
```java
boolean isSunny = true;
boolean result = !isSunny;
```
- A) `true`
- *answer* **B) `false`**
- C) `"notSunny"`
- D) Compiler error

> **Rationale:** `!` (NOT) flips the boolean. `!true` is `false`.

---

**3. (1pt) What does this code print?**
```java
int x = 5;
int y = 10;
System.out.println(x > y);
```
- A) `true`
- *answer* **B) `false`**
- C) `5`
- D) Compiler error

> **Rationale:** 5 is not greater than 10, so `x > y` evaluates to `false`.

---

**4. (1pt) What does this code print?**
```java
int temp = 32;
if (temp > 50) {
    System.out.println("warm");
} else if (temp > 32) {
    System.out.println("cool");
} else {
    System.out.println("freezing");
}
```
- A) `warm`
- B) `cool`
- *answer* **C) `freezing`**
- D) `warm` and `cool`

> **Rationale:** `32 > 50` is false. `32 > 32` is also false (not strictly greater). Neither branch runs, so the `else` block prints `"freezing"`.

---

**5. (1pt) What does this code print?**
```java
int x = 3;
int y = 5;
boolean result = (x > y) || (y != 3);
System.out.println(result);
```
- *answer* **A) `true`**
- B) `false`
- C) `5`
- D) Compiler error

> **Rationale:** `(3 > 5)` is `false`, but `(5 != 3)` is `true`. `false || true` is `true`.

---

**6. (2pts) What does this code print?**
```java
int x = 10;
if (x > 5) {
    System.out.print("a ");
}
if (x < 15) {
    System.out.print("b ");
}
if (x > 12) {
    System.out.print("c ");
}
```
- A) "a "
- *answer* **B) "a b "**
- C) "a b c "
- D) "b "

> **Rationale:** `10 > 5` is true (prints "a "), `10 < 15` is true (prints "b "), `10 > 12` is false (skipped). Each `if` is checked independently.

---


**7. (1pt) What is the value of `result`?**
```java
int result = 10 - 2 * 3 + 4;
```
- A) 28
- *answer* **B) 8**
- C) 0
- D) 6

> **Rationale:** Multiplication first: `2 * 3 = 6`. Then left to right: `10 - 6 + 4 = 8`.

---

**8. (1pt) What is the value of `result`?**
```java
double result = 15.0 / 3 / 2;
```
- A) `10.0`
- *answer* **B) `2.5`**
- C) `2`
- D) `2.0`

> **Rationale:** Division is left-to-right: `15.0 / 3 = 5.0`, then `5.0 / 2 = 2.5`.

---

**9. (2pts) What is the value of `result`?**
```java
boolean result = 4 * 2 == 8 || 3 + 1 > 10;
```
- *answer* **A) `true`**
- B) `false`
- C) `8`
- D) Compiler error

> **Rationale:** `4 * 2 == 8` is `true`. Since `||` short-circuits when the left side is `true`, the result is `true` without needing to evaluate the right side.

---

**10. (1pt) Define bytecode**:

- A) Human-readable code written by a programmer
- B) Low-level binary instructions (1s and 0s) that a CPU can execute directly
- *answer* **C) Intermediate, platform-independent code that is not quite machine code and not quite source code**
- D) A virtual machine that runs Java programs

> **Rationale:** The Java compiler converts source code into bytecode (`.class` files) — an intermediate format the JVM can run on any platform. It is not native machine code, but it's not the original source code either.

---
