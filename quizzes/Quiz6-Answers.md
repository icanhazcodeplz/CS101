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

---


**7. (1pt) Define "semiconductor":**

- A) A wire that connects two computers together
- B) A type of vacuum tube used in early computers
- C) A programming language used to control hardware
- *answer* **D) A material that can sometimes conduct electricity and sometimes resist it, used as the basis for transistors**

---