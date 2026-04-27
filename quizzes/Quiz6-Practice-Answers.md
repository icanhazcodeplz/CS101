# CS101 Quiz 6 - Practice - Answers
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
boolean a = false;
boolean b = true;
boolean c = true;
boolean result = a || b && c;
```
- *answer* **A) `true`**
- B) `false`
- C) `"true"`
- D) Compiler error

> **Rationale:** `&&` has higher precedence than `||`. `b && c` = `true && true` = `true`. Then `a || true` = `false || true` = `true`.

---

**2. (1pt) What is the value of `result`?**
```java
boolean x = true;
boolean y = false;
boolean result = !(x && y);
```
- *answer* **A) `true`**
- B) `false`
- C) `1`
- D) Compiler error

> **Rationale:** `true && false` = `false`. `!false` = `true`.

---


**3. (2pts) What is the value of `result`?**
```java
int x = 6;
boolean result = (5 > 3) && (x > 1) || !(x == 6);
```
- *answer* **A) `true`**
- B) `false`
- C) `6`
- D) Compiler error

> **Rationale:** `(5>3) && (6>1)` = `true && true` = `true`. Since the left side of `||` is `true`, the result is `true` without evaluating the right side.

---

**4. (2pts) What does this code print?**
```java
int score = 8;
if (score >= 10) {
    System.out.print("a ");
} else if (score < 9) {
    System.out.print("b ");
} else if (score <= 8) {
    System.out.print("c ");
} else {
    System.out.print("d ");
}
```
- A) `a`
- *answer* **B) `b`**
- C) `b c`
- D) `b c d`

> **Rationale:** `8 >= 10` is false. `8 < 9` is true, so `"b "` is printed and the chain exits. The `score <= 8` branch is never reached.

---

**5. (2pts) What does this code print?**
```java
boolean isRaining = true;
boolean hasUmbrella = false;
if (isRaining && hasUmbrella) {
    System.out.println("Stay dry");
} else if (isRaining && !hasUmbrella) {
    System.out.println("Get soggy");
} else {
    System.out.println("Not raining");
}
```
- A) `Stay dry`
- *answer* **B) `Get soggy`**
- C) `Not raining`
- D) `Stay dry` and `Get soggy`

> **Rationale:** `true && false` = `false` (first branch skipped). `true && !false` = `true && true` = `true`, so `"Get soggy"` prints.

---

**6. (2pts) What does this code print?**
```java
for (int i = 0; i < 4; i++) {
    System.out.print(i + " ");
}
```
- A) `1 2 3 4 `
- *answer* **B) `0 1 2 3 `**
- C) `0 1 2 3 4 `
- D) `1 2 3 `

> **Rationale:** The loop starts at `i = 0` and runs while `i < 4`, printing 0, 1, 2, 3. When `i` becomes 4, `4 < 4` is false and 4 is not printed.

---


**7. (1pt) Define "pseudocode":**

- A) Code written in Python instead of Java
- B) Code that contains syntax errors
- *answer* **C) An informal, human-readable description of a program's logic using plain language rather than actual programming syntax**
- D) Comments inside a Java program

> **Rationale:** Pseudocode lets you plan the logic of a program using plain English-like steps without worrying about exact Java syntax. It's a planning tool, not real code.

---
