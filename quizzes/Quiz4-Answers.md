# CS101 Quiz 4 - Answers

```java
import java.util.Scanner;
public class quizCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cost: ");
        double cost = scan.nextDouble();
    }
}
```

**1. (2pts) You compile and run the code above. In the console, you type `5.5` and press Enter. What happens?**

- A) The value `5` is assigned to the variable `cost`
- *answer* **B) The value `5.5` is assigned to the variable `cost`**
- C) The value `5.5` is printed to the console
- D) The program will raise an Exception

> **Rationale:** `scan.nextDouble()` reads the decimal value typed in the console and assigns it directly to `cost`. Typing `5.5` stores exactly `5.5` — no truncation, no printing.

---

**2. (2pts) Which options describe what is happening in this line of java code? SELECT ALL THAT APPLY**
```java
x += 5.5;
```
- A) We are assigning the value `5.5` to `x`
- *answer* **B) We are incrementing the value of `x` by `5.5`**
- *answer* **C) We are adding `5.5` to the current value of `x`**
- D) We are initializing the value of `x` by `5.5`

> **Rationale:** `x += 5.5` is shorthand for `x = x + 5.5` — it takes the existing value of `x` and adds `5.5` to it. B and C describe this correctly in different words. A is wrong (it ignores the existing value of `x`), and D is wrong because initialization only happens once when a variable is first declared.

---

**3. (2pts) What happens if you compile and run this line of java code?**
```java
int myInt = (int) 5.7;
```
- *answer* **A) It declares the variable `myInt` with the initialization value of `5`**
- B) It declares the variable `myInt` with the initialization value of `5.7`
- C) It declares the variable `myInt` with the initialization value of `"5.7"` (quotes are part of value)
- D) This code has an error and will not compile

> **Rationale:** `(int)` is a cast that converts a `double` to an `int` by truncating (dropping) the decimal — it does not round. So `5.7` becomes `5`. The cast is valid, so there is no compile error.

---

**4. (2pts) What happens if you compile and run this line of java code?**
```java
double myDub = Double.parseDouble("5.7");
```
- A) It declares the variable `myDub` with an initialization value of `5`
- *answer* **B) It declares the variable `myDub` with an initialization value of `5.7`**
- C) It declares the variable `myDub` with an initialization value of `"5.7"` (quotes are part of value)
- D) This code has an error and will not compile

> **Rationale:** `Double.parseDouble()` converts a `String` to a `double`. The string `"5.7"` is a valid decimal number, so it parses successfully and stores the value `5.7` in `myDub` — not a string, not truncated to `5`.

---

**5. (1pt) In Java, what is the result of `7 / 2` when both operands are of type `int`?**

- A) 3.5
- *answer* **B) 3**
- C) 4
- D) 3.0

> **Rationale:** When both operands are `int`, Java performs integer division — the decimal part is truncated, not rounded. `7 / 2` = `3.5`, truncated to `3`. The result type is also `int`, so `3.0` (a `double`) is not possible.

---

**6. (1pt) Define: Integrated Development Environment (IDE)**

- A) The core part of the OS that directly manages hardware, memory, and processes
- B) A text-based interface for typing commands directly to the shell
- *answer* **C) A software application that provides tools for writing, testing, and debugging code all in one place**
- D) A visual interface with windows, icons, and menus that users interact with using a mouse/touch

> **Rationale:** An IDE (like IntelliJ IDEA or VS Code) bundles a code editor, compiler, debugger, and other developer tools into one application. A describes a kernel, B describes a terminal/shell, and D describes a GUI/desktop environment.

---
