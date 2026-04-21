# CS101 Quiz 8 - Practice - Answers
### Covers:
 - [Topic 10: Methods](https://github.com/icanhazcodeplz/CS101)
 - [Lab10-Methods](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab10_methods/lab10Methods.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. Define the following for this method:**
```java
public static void hello(String yourName) {
    System.out.println("Hello " + yourName);
}
```
  - **Method Name:** hello
  - **Return Type:** void (nothing returned)
  - **Parameter Names:** yourName
  - **Parameter Types:** String


**2. Define the following for this method:**
```java
public static double fToC(double tempInF) {
    return (tempInF - 32) * 5.0 / 9.0;
}
```
  - **Method Name:** fToC
  - **Return Type:** double
  - **Parameter Names:** tempInF
  - **Parameter Types:** double

**3. Define the following for this method:**
```java
public static int randomIntBetween(int lowest, int highest) {
    int range = highest - lowest + 1;
    int randomInt = (int)(Math.random() * range) + lowest;
    return randomInt;
}
```
  - **Method Name:** randomIntBetween
  - **Return Type:** int
  - **Parameter Names:** lowest, highest
  - **Parameter Types:** int, int



**4. What does this code print?**
```java
public static int square(int n) {
    return n * n;
}
public static void main(String[] args) {
    int result = square(5);
    System.out.println(result);
}
```
- *answer* **A) `25`**
- B) `10`
- C) `5`
- D) `square(5)`

> **Rationale:** `square(5)` passes 5 as the argument for parameter `n`. The method returns `5 * 5` which is `25`. That value is stored in `result` and printed.

**5. What does this code print?**
```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}
public static void main(String[] args) {
    greet("Alice");
}
```
- A) `Hello, name!`
- *answer* **B) `Hello, Alice!`**
- C) `greet Alice`
- D) `Alice`

> **Rationale:** The String `"Alice"` is passed as the argument. Inside the method, `name` holds `"Alice"`, so `"Hello, " + name + "!"` produces `"Hello, Alice!"`.

**6. What does this code print?**
```java
public static int multiply(int a, int b) {
    return a * b;
}
public static void main(String[] args) {
    int result = multiply(multiply(2, 3), 2);
    System.out.println(result);
}
```
- A) `7`
- B) `10`
- C) `(2, 3), 2`
- *answer* **D) `12`**

> **Rationale:** The inner call `multiply(2, 3)` returns `6`. That return value is used as the first argument to the outer call: `multiply(6, 2)`, which returns `12`.

---

**7. What does this code print?**
```java
public static boolean isPositive(int num) {
    return num > 0;
}
public static void main(String[] args) {
    int myNum = -7;
    if (isPositive(myNum)) {
        System.out.println("Number " + myNum +  " is positive!");
    }
}
```
- A) `Number -7 is positive!`
- B) `Number 7 is positive!`
- *answer* **C) Nothing is printed**
- D) `Number myNum is positive!`

> **Rationale:** `isPositive(myNum)` evaluates `-7 > 0`, which is `false`, so the `if` block does **not** run. Since there is no `else`, nothing is printed.

---

**8. What does this code print?**
```java
public static int mystery(int a, int b) {
    if (a > b) {
        return a - b;
    } else {
        return b - a;
    }
}
public static void main(String[] args) {
    System.out.println(mystery(3, 8));
}
```
- *answer* **A) `5`**
- B) `-5`
- C) `11`
- D) Compile error

> **Rationale:** `mystery(3, 8)`: `3 > 8` is false, so the else branch runs and returns `8 - 3 = 5`. This method always returns the positive difference between two numbers.


---

**9. Define "Argument".**

- A) A variable listed in a method's definition that acts as a placeholder
- *answer* **B) The actual value passed to a method when it is called**
- C) The data type a method sends back to the caller
- D) A named, reusable block of code that performs a specific task

---