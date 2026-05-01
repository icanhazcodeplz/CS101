### CS101 Quiz 4 - Practice - Answers

**Covers**:
- Anything From **Lab 4 - User Input and Type Casting**
- Any word on the CS101 Github `vocabulary.md` file

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

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
- D) The program will raise an Exception

---

**2. (2pts) In Java, which line of code would create a new variable named `scanner` with type `Scanner` that reads input from the terminal?**

- A) `scanner scanner = new scanner(System.in);`
- B) `scanner Scanner = new Scanner(System.in);`
- C) `Scanner scanner = new Scanner(System.in);`
- D) `Scanner Scanner = new Scanner(System.in);`

---

**3. (2pts) What happens if you compile and run this line of java code?**
```java
double myDub = (double) 5;
```
- A) It declares the variable `myDub` with the initialization value of `5`
- B) It declares the variable `myDub` with the initialization value of `5.0`
- C) It declares the variable `myDub` with the initialization value of `"5.0"` (quotes are part of value)
- D) This code has an error and will not compile

---

**4. (2pts) What happens if you compile and run this line of java code?**
```java
int myInt = Integer.parseInt("hello");
```
- A) It declares the variable `myInt` with an initialization value of `hello`
- B) It declares the variable `myInt` with an initialization value of `"hello"` (quotes are part of value)
- C) It does nothing because `myInt` is not used
- D) This code has an error and will not compile

---

**5. (1pt) What is the difference between `System.out.print()` and `System.out.println()`?**

- A) There is no difference
- B) `print()` keeps the cursor on the same line; `println()` moves to a new line
- C) `println()` keeps the cursor on the same line; `print()` moves to a new line
- D) `print()` only works with integers

---

**6. (1pt) Define: Java Primitive**

- A) A data type that stores a reference to data in memory. Has methods and properties.
- B) Converting a value from one data type to another.
- C) Defining a variable's name and type, with or without an initial assignment.
- D) A built-in data type that stores a simple value directly in memory.

---