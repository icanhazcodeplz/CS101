### CS101 Quiz 8
There are 11 points possible. The score will be out of 10, thus 1 possible extra credit point.

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. (2pts) Define the following for this method:**
```java
public static void printGreeting() {
    System.out.println("Welcome!");
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
public static int milesToFeet(int miles) {
    return miles * 5280;
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
public static String averageString(double num1, double num2, double num3) {
    double sum = num1 + num2 + num3;
    double average = sum / 3.0;
    return "Average: " + average;
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
public static int cube(int n) {
    return n * n * n;
}
public static void main(String[] args) {
    int result = cube(2);
    System.out.println(result);
}
```
- A) `2`
- B) `8`
- C) `4`
- D) `6`

<div style="page-break-before: always;"></div>


**5. (1pt) What does this code print?**
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
- C) `Go, Sixers!`
- D) `Sixers`


**6. (1pt) What does this code print?**
```java
public static int mult(int a, int b) {
    return a * b;
}
public static void main(String[] args) {
    int result = mult(2, 3) + mult(1, 5);
    System.out.println(result);
}
```
- A) `11`
- B) `10`
- C) `30`
- D) `mult(2, 3) + mult(1, 5)`

**7. (1pt) What does this code print?**
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
- A) `8 is even!`
- B) `true`
- C) Nothing is printed
- D) `myNum is even!`

**8. (1pt) Define "Parameter":**

- A) The actual value passed to a method when it is called
- B) The data type a method sends back to the caller
- C) A variable listed in a method's definition that acts as a placeholder
- D) A named, reusable block of code that performs a specific task