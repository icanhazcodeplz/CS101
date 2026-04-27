### CS101 Quiz 7 - Practice

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. What does this code print?**
```java
int x = 0;
while (x < 4) {
    System.out.print(" " + x);
    x++;
}
```
- A) `0 1 2 3 4`
- B) `0 1 2 3`
- C) `1 2 3`
- D) `1 2 3 4`

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
- D) `1 3 5`

---

**3. What does this code print?**
```java
int n = 2;
do {
    System.out.print(" " + n);
    n++;
} while (n < 2);
```
- A) `2`
- B) `2 3`
- C) `2 1`
- D) Compile error

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
- C) `2 1`
- D) Compile error

---

**5. What does this code print?**
```java
int x = 5;
if (x > 3) {
    int y = 10;
    System.out.println(y);
}
```
- A) `10`
- B) `5`
- C) Nothing is printed
- D) Compile error

---

<div style="page-break-before: always;"></div>

**6. What does this code print?**
```java
int x = 1;
int y = 3;
if (y > 10) {
    x++;
}
System.out.println(x);
```
- A) `1`
- B) `2`
- C) `3`
- D) Compile error

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
- D) Compile error

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
- D) Compile error

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
- C) `hi hi 3`
- D) Compile error

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
- D) Compile error

---

**11. Define "Graphics Processing Unit (GPU)"?**

- A) The main circuit board that connects all computer components together
- B) The "brain" of the computer that executes instructions and performs calculations
- C) A specialized processor for rendering graphics and parallel computations
- D) Fast, temporary memory that stores data for running programs

---
