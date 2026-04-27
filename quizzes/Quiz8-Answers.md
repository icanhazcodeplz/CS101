# CS101 Quiz 8 - Answers
### Covers:
 - [Topic 10: Methods](https://github.com/icanhazcodeplz/CS101)
 - [Lab10-Methods](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab10_methods/lab10Methods.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. Define the following for this method:**
```java
public static void printGreeting() {
    System.out.println("Welcome!");
}
```
  - **Method Name:** printGreeting
  - **Return Type:** void (nothing returned)
  - **Parameter Names:** none
  - **Parameter Types:** none

**2. Define the following for this method:**
```java
public static int milesToFeet(int miles) {
    return miles * 5280;
}
```
  - **Method Name:** milesToFeet
  - **Return Type:** int
  - **Parameter Names:** miles
  - **Parameter Types:** int

**3. Define the following for this method:**
```java
public static String averageString(double num1, double num2, double num3) {
    double sum = num1 + num2 + num3;
    double average = sum / 3.0;
    return "Average: " + average;
}
```
  - **Method Name:** averageString
  - **Return Type:** String
  - **Parameter Names:** num1, num2, num3
  - **Parameter Types:** double, double, double



**4. What does this code print?**
```java
public static int cube(int n) {
    return n * n * n;
}
public static void main(String[] args) {
    int result = cube(2);
    System.out.println(result);
}
```
- A) `2`
- *answer* **B) `8`**
- C) `4`
- D) `6`

> **Rationale:** `cube(2)` passes 2 as the argument for parameter `n`. The method returns `2 * 2 * 2` which is `8`. That value is stored in `result` and printed.

**5. What does this code print?**
```java
public static void cheer(String team) {
    System.out.println("Go, " + team + "!");
}
public static void main(String[] args) {
    cheer("Sixers");
}
```
- A) `Go, team!`
- B) `cheer Sixers`
- *answer* **C) `Go, Sixers!`**
- D) `Sixers`

> **Rationale:** The String `"Sixers"` is passed as the argument. Inside the method, `team` holds `"Sixers"`, so `"Go, " + team + "!"` produces `"Go, Sixers!"`.

**6. What does this code print?**
```java
public static int mult(int a, int b) {
    return a * b;
}
public static void main(String[] args) {
    int result = mult(2, 3) + mult(1, 5);
    System.out.println(result);
}
```
- *answer* **A) `11`**
- B) `10`
- C) `30`
- D) `mult(2, 3) + mult(1, 5)`

> **Rationale:** `mult(2, 3)` returns `6` and `mult(1, 5)` returns `5`. The `+` operator adds these return values: `6 + 5 = 11`.

---

**7. What does this code print?**
```java
public static boolean isEven(int num) {
    return num % 2 == 0;
}
public static void main(String[] args) {
    int myNum = 8;
    if (isEven(myNum)) {
        System.out.println(myNum + " is even!");
    }
}
```
- *answer* **A) `8 is even!`**
- B) `true`
- C) Nothing is printed
- D) `myNum is even!`

> **Rationale:** `isEven(8)` evaluates `8 % 2 == 0`, which is `true`, so the `if` block **does** run and prints `8 is even!`.

---

**8. Define "Parameter".**

- A) The actual value passed to a method when it is called
- B) The data type a method sends back to the caller
- *answer* **C) A variable listed in a method's definition that acts as a placeholder**
- D) A named, reusable block of code that performs a specific task

> **Rationale:** A parameter is the variable named in the method signature (e.g., `int miles` in `milesToFeet(int miles)`). An argument is the actual value passed when the method is called. Parameters act as placeholders until the method is invoked.

---