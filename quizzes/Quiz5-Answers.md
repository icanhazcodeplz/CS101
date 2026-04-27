# CS101 Quiz 5 - Answers
There are 12 points available. The grade will be out of 10 (thus 2 EC points possible)

### Name _______________________


**1. (1pt) What is the value of `result`?**
```java
boolean a = false;
boolean b = true;
boolean result = a || b;
```
- *answer* **A) `true`**
- B) `false`
- C) `"true"`
- D) Compiler error

> **Rationale:** `||` (OR) returns `true` if at least one operand is true. Since `b` is `true`, `a || b` is `true`.

---

**2. (1pt) What is the value of `result`?**
```java
boolean isCold = false;
boolean result = !isCold;
```
- *answer* **A) `true`**
- B) `false`
- C) `"notCold"`
- D) Compiler error

> **Rationale:** `!` (NOT) flips the boolean. `!false` is `true`.

---

**3. (1pt) What does this code print?**
```java
int x = 8;
int y = 3;
System.out.println(x > y);
```
- *answer* **A) `true`**
- B) `false`
- C) `8`
- D) Compiler error

> **Rationale:** 8 is greater than 3, so `x > y` evaluates to `true`.

---

**4. (1pt) What does this code print?**
```java
double temp = 49.9;
if (temp > 50.0) {
    System.out.println("warm");
} else if (temp > 32.0) {
    System.out.println("cool");
} else {
    System.out.println("freezing");
}
```
- A) `warm`
- *answer* **B) `cool`**
- C) `freezing`
- D) `warm` and `cool`

> **Rationale:** `49.9 > 50.0` is false, so the first branch is skipped. `49.9 > 32.0` is true, so `"cool"` is printed and the rest of the chain is skipped.

---

**5. (1pt) What does this code print?**
```java
int x = 3;
int y = 5;
boolean result = (x < y) && (y != 3);
System.out.println(result);
```
- *answer* **A) `true`**
- B) `false`
- C) `5`
- D) Compiler error

> **Rationale:** `(3 < 5)` is `true` and `(5 != 3)` is `true`. `true && true` is `true`.

---

**6. (2pts) What does this code print?**
```java
int x = 12;
if (x >= 5) {
    System.out.print("a ");
}
if (x <= 15) {
    System.out.print("b ");
}
if (x >= 12) {
    System.out.print("c ");
}
```
- A) "a "
- B) "a b "
- *answer* **C) "a b c "**
- D) "b "

> **Rationale:** These are three separate (non-else-if) conditions, each checked independently. `12 >= 5` is true, `12 <= 15` is true, and `12 >= 12` is true, so all three branches print.

---


**7. (1pt) What is the value of `result`?**
```java
int result = 12 - 3 * 2 + 1;
```
- A) 19
- *answer* **B) 7**
- C) 1
- D) 5

> **Rationale:** Multiplication happens before addition/subtraction: `3 * 2 = 6`. Then left to right: `12 - 6 + 1 = 7`.

---

**8. (1pt) What is the value of `result`?**
```java
double result = 18.0 / 3 / 2;
```
- A) `6.0`
- *answer* **B) `3.0`**
- C) `3`
- D) `9.0`

> **Rationale:** Division is left-to-right: `18.0 / 3 = 6.0`, then `6.0 / 2 = 3.0`.

---

**9. (2pts) What is the value of `result`?**
```java
boolean result = 3 * 3 == 9 && 2 + 1 > 5;
```
- A) `true`
- *answer* **B) `false`**
- C) `9`
- D) Compiler error

> **Rationale:** `3 * 3 == 9` is `true`, but `2 + 1 > 5` is `3 > 5` which is `false`. `true && false` is `false`.

---

**10. (1pt) Define Vacuum Tube**:

- A) A small chip made of silicon that contains millions of tiny transistors
- B) A programming language used to write machine code
- *answer* **C) An early electronic component used in first-generation computers to switch and amplify electrical signals**
- D) A type of memory that stores data permanently

> **Rationale:** Vacuum tubes were used in first-generation computers (like ENIAC) to switch and amplify electrical signals. They were later replaced by much smaller and more efficient transistors.

---
