### CS101 Quiz 8 - Practice

**1. (2pts) Define the following for this method:**
```java
public static void hello(String yourName) {
    System.out.println("Hello " + yourName);
}
```
<table style="margin-left: 30px; border-spacing: 0;">
<tr>
<td style="padding: 2px 8px;">Method Name:</td>
<td style="padding: 2px 8px;">Parameter Names:</td>
</tr>
<tr>
<td style="padding: 2px 8px;">Return Type:</td>
<td style="padding: 2px 8px;">Parameter Types:</td>
</tr>
</table>

**2. (2pts) Define the following for this method:**
```java
public static double fToC(double tempInF) {
    return (tempInF - 32) * 5.0 / 9.0;
}
```
<table style="margin-left: 30px; border-spacing: 0;">
<tr>
<td style="padding: 2px 8px;">Method Name:</td>
<td style="padding: 2px 8px;">Parameter Names:</td>
</tr>
<tr>
<td style="padding: 2px 8px;">Return Type:</td>
<td style="padding: 2px 8px;">Parameter Types:</td>
</tr>
</table>

**3. (2pts) Define the following for this method:**
```java
public static int randomIntBetween(int lowest, int highest) {
    int range = highest - lowest + 1;
    int randomInt = (int)(Math.random() * range) + lowest;
    return randomInt;
}
```
<table style="margin-left: 30px; border-spacing: 0;">
<tr>
<td style="padding: 2px 8px;">Method Name:</td>
<td style="padding: 2px 8px;">Parameter Names:</td>
</tr>
<tr>
<td style="padding: 2px 8px;">Return Type:</td>
<td style="padding: 2px 8px;">Parameter Types:</td>
</tr>
</table>

**4. (1pt) What does this code print?**
```java
public static int square(int n) {
    return n * n;
}
public static void main(String[] args) {
    int result = square(5);
    System.out.println(result);
}
```
- A) `25`
- B) `10`
- C) `5`
- D) `square(5)`

**5. (1pt) What does this code print?**
```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}
public static void main(String[] args) {
    greet("Alice");
}
```
- A) `Hello, name!`
- B) `Hello, Alice!`
- C) `greet Alice`
- D) `Alice`

<div style="page-break-before: always;"></div>

**6. (1pt) What does this code print?**
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
- D) `12`

**7. (1pt) What does this code print?**
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
- C) Nothing is printed
- D) `Number myNum is positive!`

**8. (1pt) What does this code print?**
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
- A) `5`
- B) `-5`
- C) `11`
- D) Compile error

**9. (1pt) Define "Argument".**

- A) A variable listed in a method's definition that acts as a placeholder
- B) The actual value passed to a method when it is called
- C) The data type a method sends back to the caller
- D) A named, reusable block of code that performs a specific task
