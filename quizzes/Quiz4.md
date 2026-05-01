### CS101 Quiz 4

### Name _______________________


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
- B) The value `5.5` is assigned to the variable `cost`
- C) The value `5.5` is printed to the console
- D) The program will raise an Exception

---

**2. (2pts) Which options describe what is happening in this line of java code? SELECT ALL THAT APPLY**
```java
x += 5.5;
```
- A) We are assigning the value `5.5` to `x`
- B) We are incrementing the value of `x` by `5.5`
- C) We are adding `5.5` to the current value of `x`
- D) We are initializing the value of `x` by `5.5`

---

**3. (2pts) What happens if you compile and run this line of java code?**
```java
int myInt = (int) 5.7;
```
- A) It declares the variable `myInt` with the initialization value of `5`
- B) It declares the variable `myInt` with the initialization value of `5.7`
- C) It declares the variable `myInt` with the initialization value of `"5.7"` (quotes are part of value)
- D) This code has an error and will not compile

---

**4. (2pts) What happens if you compile and run this line of java code?**
```java
double myDub = Double.parseDouble("5.7");
```
- A) It declares the variable `myDub` with an initialization value of `5`
- B) It declares the variable `myDub` with an initialization value of `5.7`
- C) It declares the variable `myDub` with an initialization value of `"5.7"` (quotes are part of value)
- D) This code has an error and will not compile

---

**5. (1pt) In Java, what is the result of `7 / 2` when both operands are of type `int`?**

- A) 3.5
- B) 3
- C) 4
- D) 3.0

---

**6. (1pt) Define: Integrated Development Environment (IDE)**

- A) The core part of the OS that directly manages hardware, memory, and processes
- B) A text-based interface for typing commands directly to the shell
- C) A software application that provides tools for writing, testing, and debugging code all in one place
- D) A visual interface with windows, icons, and menus that users interact with using a mouse/touch

---