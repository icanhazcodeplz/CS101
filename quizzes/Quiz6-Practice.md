### CS101 Quiz 6 - Practice

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. (1pt) What is the value of `result`?**
```java
boolean a = false;
boolean b = true;
boolean c = true;
boolean result = a || b && c;
```
- A) `true`
- B) `false`
- C) `"true"`
- D) Compiler error

---

**2. (1pt) What is the value of `result`?**
```java
boolean x = true;
boolean y = false;
boolean result = !(x && y);
```
- A) `true`
- B) `false`
- C) `1`
- D) Compiler error

---

**3. (2pts) What is the value of `result`?**
```java
int x = 6;
boolean result = (5 > 3) && (x > 1) || !(x == 6);
```
- A) `true`
- B) `false`
- C) `6`
- D) Compiler error

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
- B) `b`
- C) `b c`
- D) `b c d`

---

<div style="page-break-before: always;"></div>

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
- B) `Get soggy`
- C) `Not raining`
- D) `Stay dry` and `Get soggy`

---

**6. (2pts) What does this code print?**
```java
for (int i = 0; i < 4; i++) {
    System.out.print(i + " ");
}
```
- A) `1 2 3 4 `
- B) `0 1 2 3 `
- C) `0 1 2 3 4 `
- D) `1 2 3 `

---

**7. (1pt) Define "pseudocode":**

- A) Code written in Python instead of Java
- B) Code that contains syntax errors
- C) An informal, human-readable description of a program's logic using plain language rather than actual programming syntax
- D) Comments inside a Java program

---
