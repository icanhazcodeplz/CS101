# CS101 Quiz 4 - Practice - Answers

**Covers**:
- Anything From **Lab 4 - User Input and Type Casting**
- Any word on the CS101 Github `vocabulary.md` file

```java
import java.util.Scanner;
public class quizCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("You input: " + age);
    }
}
```

**1. (2pts) You compile and run the code above. In the console, you type *five* and press Enter. What happens?**

- A) The value `"five"` is assigned to the variable `age`
- B) The value `"5"` is assigned to the variable `age`
- C) The value `5` is assigned to the variable `age`
- *answer* **D) The program will raise an Exception**

> **Rationale:** `input.nextInt()` expects a whole number. Typing the word `five` cannot be parsed as an integer, so Java throws an `InputMismatchException` at runtime and the program crashes.

---

**2. (2pts) In Java, which line of code would create a new variable named `scanner` with type `Scanner` that reads input from the terminal?**

- A) `scanner scanner = new scanner(System.in);`
- B) `scanner Scanner = new Scanner(System.in);`
- *answer* **C) `Scanner scanner = new Scanner(System.in);`**
- D) `Scanner Scanner = new Scanner(System.in);`

> **Rationale:** Java is case-sensitive. The class name is `Scanner` (capital S), so the type must be `Scanner`. Options A and B use `scanner` (lowercase) as the type, which doesn't exist. Option D uses `Scanner` as both the type and variable name, which shadows the class and won't work as expected.

---

**3. (2pts) What happens if you compile and run this line of java code?**
```java
double myDub = (double) 5;
```
- A) It declares the variable `myDub` with the initialization value of `5`
- *answer* **B) It declares the variable `myDub` with the initialization value of `5.0`**
- C) It declares the variable `myDub` with the initialization value of `"5.0"` (quotes are part of value)
- D) This code has an error and will not compile

> **Rationale:** `(double)` casts the integer `5` to a `double`, adding a decimal component to produce `5.0`. The variable is declared as `double`, so `5.0` is stored — not the integer `5`, and not a string.

---

**4. (2pts) What happens if you compile and run this line of java code?**
```java
int myInt = Integer.parseInt("hello");
```
- A) It declares the variable `myInt` with an initialization value of `hello`
- B) It declares the variable `myInt` with an initialization value of `"hello"` (quotes are part of value)
- C) It does nothing because `myInt` is not used
- *answer* **D) This code has an error and will not compile**

> **Rationale:** `Integer.parseInt()` requires a string that contains a valid integer. `"hello"` cannot be converted to a number, so Java throws a `NumberFormatException` at runtime — the program crashes with an error.

---

**5. (1pt) What is the difference between `System.out.print()` and `System.out.println()`?**

- A) There is no difference
- *answer* **B) `print()` keeps the cursor on the same line; `println()` moves to a new line**
- C) `println()` keeps the cursor on the same line; `print()` moves to a new line
- D) `print()` only works with integers

> **Rationale:** `println()` stands for "print line" — it appends a newline character (`\n`) after the output, moving the cursor to the next line. `print()` outputs text and leaves the cursor immediately after it on the same line.

---

**6. (1pt) Define: Java Primitive**

- A) A data type that stores a reference to data in memory. Has methods and properties.
- B) Converting a value from one data type to another.
- C) Defining a variable's name and type, with or without an initial assignment.
- *answer* **D) A built-in data type that stores a simple value directly in memory.**

> **Rationale:** Java primitives (`int`, `double`, `boolean`, `char`, etc.) hold their value directly in the variable. This contrasts with reference types (like `String` or `Scanner`) which store a memory address pointing to the actual data. Primitives have no methods or properties.

---
