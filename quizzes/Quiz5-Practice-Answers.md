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

---


**7. (1pt) What is the value of `result`?**
```java
int result = 10 - 2 * 3 + 4;
```
- A) 28
- *answer* **B) 8**
- C) 0
- D) 6

---

**8. (1pt) What is the value of `result`?**
```java
double result = 15.0 / 3 / 2;
```
- A) `10.0`
- *answer* **B) `2.5`**
- C) `2`
- D) `2.0`

---

**9. (2pts) What is the value of `result`?**
```java
boolean result = 4 * 2 == 8 || 3 + 1 > 10;
```
- *answer* **A) `true`**
- B) `false`
- C) `8`
- D) Compiler error

---

**10. (1pt) Define bytecode**:

- A) Human-readable code written by a programmer
- B) Low-level binary instructions (1s and 0s) that a CPU can execute directly
- *answer* **C) Intermediate, platform-independent code that is not quite machine code and not quite source code**
- D) A virtual machine that runs Java programs

---

