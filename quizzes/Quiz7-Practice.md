# CS101 Quiz 7 - Practice - Answers
### Covers:
 - While loops and do-while loops (lab8)
 - "Scope" for `if`  statements and `for` loops
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - No Notes
 - Will have printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. What does this code print?**
```java
int x = 0;
while (x < 4) {
    System.out.print(" " + x);
    x++;
}
```
- A) `0 1 2 3 4`
- *answer* **B) `0 1 2 3`**
- C) `1 2 3`
- D) `1 2 3 4`

> **Rationale:** `x` starts at 0. The loop prints `x` then increments. It runs for x = 0, 1, 2, 3. When x becomes 4, the condition `x < 4` is false, so the loop stops. 4 is never printed.

---

**2. What does this code print?**
```java
int n = 1;
while (n < 6) {
    System.out.print(" " + n);
    n += 2;
}
```
- A) `1 2 3 4 5`
- B) `1 3 5 7`
- C) `3 5`
- *answer* **D) `1 3 5`**

> **Rationale:** `n` starts at 1. Each iteration prints `n` then adds 2. It runs for n = 1, 3, 5. When n becomes 7, the condition `n < 6` is false, so the loop stops. 7 is never printed.

---


**3. What does this code print?**
```java
int n = 2;
do {
    System.out.print(" " + n);
    n++;
} while (n < 2);
```
- *answer* **A) `2`**
- B) `2 3`
- C) `2 1`
- D) Compile error

> **Rationale:** A do-while loop always runs the body at least once before checking the condition. It prints `2`, then `n` becomes 3. The condition `3 < 2` is false, so the loop stops after one iteration.

---

**4. What does this code print?**
```java
int x = 3;
do {
    x--;
    System.out.print(" " + x);
} while (x > 1);
```
- A) `3 2 1`
- B) `2 1 0`
- *answer* **C) `2 1`**
- D) Compile error

> **Rationale:** A do-while loop always runs the body at least once. First iteration: `x--` makes x=2, prints `2`. Condition `2 > 1` is true. Second iteration: `x--` makes x=1, prints `1`. Condition `1 > 1` is false, so the loop stops. Output is `2 1`.

---

**5. What does this code print?**
```java
int x = 5;
if (x > 3) {
    int y = 10;
    System.out.println(y);
}
```
- *answer* **A) `10`**
- B) `5`
- C) Nothing is printed
- D) Compile error

> **Rationale:** `x` is 5, which is greater than 3, so the if block runs. Inside, `y` is declared and set to 10, then printed. Both `x` and `y` are in scope where they're used, so no errors.

---

**6. What does this code print?**
```java
int x = 1;
int y = 3;
if (y > 10) {
    x++;
}
System.out.println(x);
```
- *answer* **A) `1`**
- B) `2`
- C) `3`
- D) Compile error

> **Rationale:** `x` starts at 1. The condition `y > 10` is false because `y` is 3, so the if block does not run and `x` is never incremented. Then `System.out.println(x)` prints `1`.

---

**7. What does this code print?**
```java
int x = 1;
if (x == 1) {
    int a = 7;
}
System.out.println(a);
```
- A) `7`
- B) `1`
- C) `0`
- *answer* **D) Compile error**

> **Rationale:** `a` is declared inside the if block, so its scope ends at the closing `}`. The `System.out.println(a)` is outside that block, where `a` doesn't exist. The compiler reports "cannot find symbol."

---

**8. What does this code print?**
```java
for (int i = 0; i < 3; i++) {
    int doubled = i * 2;
}
System.out.println(doubled);
```
- A) `4`
- B) `6`
- C) `0`
- *answer* **D) Compile error**

> **Rationale:** `doubled` is declared inside the for loop block, so its scope ends at the closing `}`. The `System.out.println(doubled)` is outside that block, where `doubled` doesn't exist.

---

**9. What does this code print?**
```java
int i = 0;
for (i = 1; i <= 2; i++) {
    System.out.print("hi ");
}
System.out.print(i);
```
- A) `hi 0`
- B) `hi hi 0`
- *answer* **C) `hi hi 3`**
- D) Compile error

> **Rationale:** `i` is declared before the loop, so it's still in scope after. The loop runs for i=1 (prints "hi ") and i=2 (prints "hi "), then `i++` makes i=3. The condition `3 <= 2` is false, so the loop exits. Then `System.out.print(i)` prints `3`.

---

**10. What does this code print?**
```java
int j = 0;
for (j = 0; j <= 3; j++) {
    System.out.print("go ");
    int x = j;
}
System.out.print(j);
System.out.print(x);
```
- A) `go go go 3`
- B) `go go go go 4`
- C) `go go go go 3`
- *answer* **D) Compile error**

> **Rationale:** `x` is declared inside the for loop body, so its scope ends at the closing `}`. The `System.out.print(x)` is outside that block, where `x` doesn't exist. The compiler reports "cannot find symbol." Note that `j` is still in scope since it was declared before the loop, but `x` is not.

---

**11. Define "Graphics Processing Unit (GPU)"?**

- A) The main circuit board that connects all computer components together
- B) The "brain" of the computer that executes instructions and performs calculations
- *answer* **C) A specialized processor for rendering graphics and parallel computations**
- D) Fast, temporary memory that stores data for running programs

---

