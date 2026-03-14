# CS101 Quiz 7 - Answers
#### There are 13 possible points. Your score will be out of 10 (thus 3 possible extra credit points)

### Covers:
 - While loops and do-while loops (lab8)
 - "Scope" for `if`  statements and `for` loops
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - No Notes
 - Will have printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. (2pts) What does this code print?**
```java
int n = 2;
while (n <= 6) {
    System.out.print(" " + n);
    n += 2;
}
```
- A) `2 3 4 5 6`
- B) `4 5 6`
- C) `2 4 `
- *answer* **D) `2 4 6`**

> **Rationale:** `n` starts at 2. Each iteration prints `n` then adds 2. It runs for n = 2, 4, 6. When n becomes 8, the condition `n <= 6` is false, so the loop stops. 8 is never printed.

---


**2. (2pts) What does this code print?**
```java
int n = 1;
do {
    n++;
    System.out.print(" " + n);
} while (n < 4);
```
- *answer* **A) `2 3 4`**
- B) `1 2 3`
- C) `1 2 3 4`
- D) Compile error

> **Rationale:** A do-while loop always runs the body at least once. First iteration: `n++` makes n=2, prints `2`. Condition `2 < 4` is true. Second iteration: `n++` makes n=3, prints `3`. Condition `3 < 4` is true. Third iteration: `n++` makes n=4, prints `4`. Condition `4 < 4` is false, so the loop stops. Output is `2 3 4`.

---

**3. (2pts) What does this code print?**
```java
int x = 8;
if (x > 5) {
    int y = 20;
    System.out.println(y);
}
```
- *answer* **A) `20`**
- B) `8`
- C) Nothing is printed
- D) Compile error

> **Rationale:** `x` is 8, which is greater than 5, so the if block runs. Inside, `y` is declared and set to 20, then printed. Both `x` and `y` are in scope where they're used, so no errors.

---

**4. (2pts) What does this code print?**
```java
int x = 4;
int y = 2;
if (y > 7) {
    x++;
}
System.out.println(x);
```
- *answer* **A) `4`**
- B) `5`
- C) `2`
- D) Compile error

> **Rationale:** `x` starts at 4. The condition `y > 7` is false because `y` is 2, so the if block does not run and `x` is never incremented. Then `System.out.println(x)` prints `4`.

---

**5. (2pts) What does this code print?**
```java
int x = 5;
if (x == 5) {
    int a = 9;
}
System.out.println(a);
```
- A) `9`
- B) `5`
- C) `0`
- *answer* **D) Compile error**

> **Rationale:** `a` is declared inside the if block, so its scope ends at the closing `}`. The `System.out.println(a)` is outside that block, where `a` doesn't exist. The compiler reports "cannot find symbol."

---

**6. (2pts) What does this code print?**
```java
for (int i = 2; i <= 4; i++) {
    System.out.print(" " + i);
}
System.out.print(i);
```
- A) `2 3 4 5`
- B) `2 3 4`
- C) `2 3 4 2`
- *answer* **D) Compile error**

> **Rationale:** `i` is declared inside the for loop header (`int i = 2`), so its scope ends at the closing `}`. There is a `System.out.print(i)` after the loop, thus outside `i`'s scope. The compiler reports "cannot find symbol."

---

**7. (1pt) Define "Random Access Memory (RAM)":**

- A) The main circuit board that connects all computer components together
- B) The "brain" of the computer that executes instructions and performs calculations
- C) A specialized processor for rendering graphics and parallel computations
- *answer* **D) Fast, temporary memory that stores data for running programs**

---