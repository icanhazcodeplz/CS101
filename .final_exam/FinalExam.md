## CS101 — Final Exam

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1.** What directory is the *parent* of folder `lab2` in the diagram below?
```
projects
├── java
│     ├── HelloWorld.java
│     └── lab2
│          └── Lab2.java
└── notes.txt
```

- A) projects
- B) java
- C) lab2
- D) Lab2.java


**2.** What is the decimal value of the binary number `1010`?

- A) 5
- B) 8
- C) 10
- D) 12


**3.** How many bits are in one byte?

- A) 4
- B) 8
- C) 16
- D) 10



**4.** What is the minimum number of binary digits (bits) needed to represent all 12 months of the year?

- A) 3
- B) 4
- C) 6
- D) 12



**5.** About how many bytes are in a kilobyte (KB)?

- A) Thousand
- B) Million
- C) Billion
- D) Trillion


**6.** What is printed?

```java
int a = 7;
int b = 2;
System.out.println(a / b);
```

- A) 3.5
- B) 3
- C) 4
- D) 7

<div style="page-break-before: always;"></div>


**7.** What is the value of `result`?

```java
int result = 10 + 4 / 2;
```

- A) 7
- B) 12
- C) 10
- D) 14

**8.** Which of the following correctly declares an integer variable named `count` initialized to `0`?

- A) **`int count;`**
- B) **`count = 0;`**
- C) **`int count = 0;`**
- D) **`integer count = 0;`**


**9.** What is printed?

```java
double x = 5.0;
double y = 2.0;
System.out.println(x / y);
```

- A) 2
- B) 2.0
- C) 2.5
- D) 3


**10.** What is printed?

```java
int score = 10;
score += 5;
score -= 3;
System.out.println(score);
```

- A) 10
- B) 3
- C) 18
- D) 12



**11.** What is the value of `result`?

```java
int result = 2 + 3 * 4 - 1;
```

- A) 19
- B) 13
- C) 14
- D) 11



**12.** What is printed?

```java
double d = 9.99;
int i = (int) d;
System.out.println(i);
```

- A) 10
- B) 9.99
- C) 9
- D) Compile error

<div style="page-break-before: always;"></div>


**13.** What is printed?

```java
System.out.println("They said \"hello\"");
```

- A) **`They said "hello"`**
- B) **`They said \"hello\"`**
- C) **`They said hello`**
- D) Compile error



**14.** What is printed?

```java
int a = 5;
int b = 2;
double result = (double) a / b;
System.out.println(result);
```

- A) 2.0
- B) 2.5
- C) 2
- D) 3.0




**15.** What is printed?

```java
System.out.print("Hello ");
System.out.print("World");
```

- A) **`Hello`** then **`World`** on a new line
- B) **`HelloWorld`**
- C) **`Hello World`**
- D) **`Hello\nWorld`**



**16.** What is printed?

```java
System.out.println("line1\nline2");
```

- A) **`line1\nline2`**
- B) **`line1 line2`**
- C) **`line1`** then **`line2`** on the next line
- D) Compile error




**17.** What is printed?

```java
int x = 5;
boolean result = (x > 3) && (x < 10);
System.out.println(result);
```

- A) true
- B) false



**18.** What is printed?

```java
int x = 15;
boolean result = (x < 5) || (x > 10);
System.out.println(result);
```

- A) false
- B) true



**19.** What is printed?

```java
boolean flag = false;
System.out.println(!flag);
```

- A) false
- B) true

<div style="page-break-before: always;"></div>


**20.** What is the value of `result`?

```java
int a = 4;
boolean result = a > 2 && a < 6 || a == 10;
```

- A) false
- B) true




**21.** Which boolean expression will always evaluate to `false`, regardless of the value of `x`?

- A) **`x > 5 && x < 10`**
- B) **`x > 5 && x < 3`**
- C) **`x > 5 || x < 10`**
- D) **`x > 5 || x > 3`**




**22.** What is printed?

```java
int x = 10;
if (x > 5) {
    System.out.println("greater than 5");
}
if (x > 8) {
    System.out.println("greater than 8");
}
```

- A) **`greater than 5`**
- B) **`greater than 8`**
- C) **`greater than 5`**   then   **`greater than 8`** on the next line
- D) Nothing



**23.** What is printed?

```java
int x = 7;
if (x > 5) {
    if (x > 10) {
        System.out.println("big");
    } else {
        System.out.println("medium");
    }
} else {
    System.out.println("small");
}
```

- A) **`big`**
- B) **`medium`**
- C) **`small`**
- D) Nothing



**24.** What is printed?

```java
int temp = 30;
if (temp > 100) {
    System.out.println("boiling");
} else if (temp > 70) {
    System.out.println("hot");
}
```

- A) **`boiling`**
- B) **`hot`**
- C) **`boiling`** then **`hot`**
- D) Nothing is printed

<div style="page-break-before: always;"></div>



**25.** What is printed?

```java
int x = 10;
if (x > 5) {
    System.out.println("A");
} else if (x > 8) {
    System.out.println("B");
}
```

- A) **`A`**
- B) **`B`**
- C) **`A`** then **`B`**
- D) Nothing




**26.** What is printed?

```java
int age = 20;
boolean knowsPpl = false;

if (age > 20 || knowsPpl) {
    System.out.println("allowed");
} else {
    System.out.println("denied");
}
```

- A) **`allowed`**
- B) **`denied`**
- C) Compile error
- D) Nothing



**27.** What is printed?

```java
String color = "Red";
String colorLower = color.toLowerCase();
if (colorLower.equals("blue")) {
    System.out.println("It's blue");
} else if (colorLower.equals("red")) {
    System.out.println("It's red");
} else {
    System.out.println("Unknown color");
}
```

- A) **`It's blue`**
- B) **`It's red`**
- C) **`Unknown color`**
- D) Compile error



**28.** What is printed?

```java
for (int i = 0; i < 5; i++) {
    System.out.print(i + " ");
}
```

- A) **`0 1 2 3 4 `**
- B) **`1 2 3 4 5 `**
- C) **`0 1 2 3 4 5 `**
- D) **`1 2 3 4 `**

<div style="page-break-before: always;"></div>


**29.** What is printed?

```java
int n = 1;
while (n <= 5) {
    System.out.print(n + " ");
    n++;
}
```

- A) **`1 2 3 4 5 6 `**
- B) **`1 2 3 4 `**
- C) **`1 2 3 4 5 `**
- D) **`0 1 2 3 4 5 `**



**30.** What is printed?

```java
int x = 10;
do {
    System.out.println("hello");
    x++;
} while (x < 5);
```

- A) **`hello`** is printed infinitely
- B) **`hello`** is printed 5 times
- C) **`hello`** is printed once
- D) Nothing is printed



**31.** What is printed?

```java
int sum = 0;
for (int i = 1; i <= 4; i++) {
    sum += i;
}
System.out.println(sum);
```

- A) 4
- B) 6
- C) 10
- D) 12



**32.** What is printed?

```java
for (int i = 0; i <= 10; i += 3) {
    System.out.print(i + " ");
}
```

- A) **`0 3 6 9 `**
- B) **`0 3 6 9 12 `**
- C) **`3 6 9 12 `**
- D) **`0 3 6 9 10 `**



**33.** What is printed?

```java
int count = 5;
while (count > 0) {
    System.out.print(count + " ");
    count--;
}
```

- A) **`5 4 3 2 1 0 `**
- B) **`5 4 3 2 1 `**
- C) **`4 3 2 1 0 `**
- D) Compile error

<div style="page-break-before: always;"></div>



**34.** How many asterisks (`*`) are printed in total?

```java
for (int i = 1; i <= 2; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

- A) 2
- B) 3
- C) 5
- D) 6



**35.** What is printed?

```java
int[] nums = {2, 4, 6, 8};
for (String s : nums) {
    System.out.print(s + " ");
}
```

- A) **`0 1 2 3 `**
- B) **`2 4 6 8 `**
- C) **`2 4 6 8 10 `**
- D) Compile error



**36.** What is printed?

```java
for (int i = 0; i < 3; i++) {
    int x = i * 2;
}
System.out.println(x);
```

- A) **`4`**
- B) **`6`**
- C) **`0`**
- D) Compile error



**37.** What is printed?

```java
int score = 85;
if (score >= 80) {
    String grade = "B";
}
System.out.println(grade);
```

- A) **`B`**
- B) **`85`**
- C) **`null`**
- D) Compile error



**38.** What is printed?

```java
String result = "";
for (int i = 1; i <= 3; i++) {
    result = result + i;
}
System.out.println(result);
```

- A) **`6`**
- B) **`1 2 3`**
- C) **`123`**
- D) **`+1+2+3`**

<div style="page-break-before: always;"></div>


**39.** What is printed?

```java
public static void farewell(String name) {
    System.out.println("Goodbye, " + name + "!");
}

public static void main(String[] args) {
    farewell("Bob");
}
```

- A) **`Goodbye, !`**
- B) **`Goodbye, name!`**
- C) **`Goodbye, Bob!`**
- D) Compile error


**40.** What is printed?

```java
public static int triple(int n) {
    return n * 3;
}

public static void main(String[] args) {
    System.out.println(triple(5));
}
```

- A) 5
- B) 10
- C) 15
- D) 555



**41.** In the code below, what is `42`?

```java
public static void printNum(int num) {
    System.out.println(num);
}

public static void main(String[] args) {
    printNum(42);
}
```

- A) A parameter
- B) An argument
- C) A return type
- D) A method name



**42.** What is printed?

```java
public static int add(int a, int b) {
    return a + b;
}
public static int mult(int a, int b) {
    return a * b;
}
public static void main(String[] args) {
    int result = add(4, mult(2, 3));
    System.out.println(result);
}
```

- A) 46
- B) 9
- C) 10
- D) 24

<div style="page-break-before: always;"></div>


**43.** What is the return type of the following method?

```java
public static String repeat(String s, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
        result += s;
    }
    return result;
}
```

- A) **`int`**
- B) **`result`**
- C) **`String`**
- D) **`static`**




**44.** What is printed?

```java
public static int mystery(int x) {
    int y = x * 2;
    y += 3;
    return y;
}

public static void main(String[] args) {
    System.out.println(mystery(4));
}
```

- A) 4
- B) 8
- C) 11
- D) 12



**45.** What is printed?

```java
int[] nums = {10, 20, 30, 40, 50};
System.out.println(nums[2]);
```

- A) 10
- B) 20
- C) 30
- D) 40



**46.** What is printed?

```java
int[] nums = {0, 1, 2, 3};
System.out.println(nums.length);
```

- A) **`[0, 1, 2, 3]`**
- B) **3**
- C) **4**
- D) compile error



**47.** What is printed?

```java
int[] nums = {1, 2, 3};
nums[1] = 99;
System.out.println(nums[1]);
```

- A) 1
- B) 2
- C) 3
- D) 99

<div style="page-break-before: always;"></div>



**48.** What is printed?

```java
int[] arr = {5, 10, 15, 20};
System.out.println(arr[arr.length - 1]);
```

- A) 5
- B) 10
- C) 15
- D) 20



**49.** What is printed?

```java
int[] nums = {1, 2, 3, 4};
System.out.println(nums[4]);
```

- A) **`3`**
- B) **`4`**
- C) **`null`**
- D) Runtime error 



**50.** What is printed?

```java
int[] nums = {10, 30, 10};
int s = 0;
for (int i = 0; i < nums.length; i++) {
    s += nums[i];
}
System.out.println(s);
```

- A) 103010
- B) 40
- C) 30
- D) 50




**51.** What is printed?

```java
ArrayList<String> list = new ArrayList<String>();
list.add("cat");
list.add("dog");
list.add("fish");
System.out.println(list.size());
```

- A) 2
- B) 3
- C) 4
- D) 0



**52.** What is printed?

```java
ArrayList<Integer> nums = new ArrayList<Integer>();
nums.add(10);
nums.add(20);
nums.add(30);
System.out.println(nums.get(1));
```

- A) 10
- B) 20
- C) 30
- D) 1

<div style="page-break-before: always;"></div>


**53.** What is printed?

```java
ArrayList<String> colors = new ArrayList<String>();
colors.add("red");
colors.add("green");
colors.add("blue");
colors.remove(0);
System.out.println(colors.get(0));
```

- A) **`red`**
- B) **`green`**
- C) **`blue`**
- D) Compile error



**54.** What is printed?

```java
ArrayList<String> list = new ArrayList<String>();
list.add("hello");
list.add("world");
System.out.println(list.contains("Hello"));
```

- A) 0
- B) true
- C) false
- D) Hello



**55.** What is printed?

```java
String s = "Hello, World!";
System.out.println(s.toUpperCase());
```

- A) HELLO, WORLD!
- B) Hello, World!
- C) hello, world!
- D) false



**56.** What is printed?

```java
String text = "I love Java!";
System.out.println(text.endsWith("e Java!"));
```

- A) true
- B) false
- C) e Java!
- D) 7



**57.** What is printed?

```java
String s = "banana";
String result = s.replace("a", "o");
System.out.println(s);
System.out.println(result);
```

- A) **`bonono`** then **`bonono`**
- B) **`banana`** then **`bonono`**
- C) **`bonono`** then **`banana`**
- D) **`banana`** then **`banana`**

<div style="page-break-before: always;"></div>


**58.** What is printed?

```java
String csv = "apple,banana,cherry";
String[] parts = csv.split(",");
System.out.println(parts[2]);
```

- A) **`apple`**
- B) **`banana`**
- C) **`cherry`**
- D) **`applebananacherry`**



**59.** Define **Graphical User Interface (GUI):**

- A) A text-based interface for typing commands directly to the shell
- B) Core part of the OS that directly manages hardware, memory, and processes
- C) Software designed for end-users to perform a specific task
- D) A visual interface with windows, icons, and menus that users interact with using a mouse or touch


**60.** Define **Unicode:**

- A) A character encoding that represents 128 characters using 7 bits
- B) A color model that combines red, green, and blue light values
- C) A universal character encoding standard that supports characters from all writing systems, including emojis
- D) A plain-text file format where fields are separated by commas



**61.** Define **concatenation:**

- A) Converting a value from one data type to another
- B) Analyzing a string and splitting it into usable components
- C) Treating uppercase and lowercase letters as different characters
- D) Joining two or more strings together using the **`+`** operator



**62.** Define **Java Primitive:**

- A) A resizable collection of objects that can grow and shrink
- B) A named, reusable block of code that performs a specific task
- C) A basic built-in data type that stores a simple value directly in memory
- D) Intermediate, platform-independent code that runs on the JVM



**63.** Define **Transistor:**

- A) An electronic component that controls electric current flow inside a glass bulb
- B) A material that can sometimes conduct electricity and sometimes resist it
- C) A mechanical calculator capable of the four basic arithmetic operations
- D) An electronic switch made of semiconductor material, smaller and faster than vacuum tubes



**64.** Define **Method Call:**

- A) A variable listed in a method's definition that acts as a placeholder for a value
- B) The data type of the value a method sends back to the caller
- C) Executing a method by writing its name followed by parentheses with any required arguments
- D) The actual value passed to a method when it is invoked



**65.** Define **Element**:

- A) The position of a value in an array, starting at 0
- B) A single value stored at a specific index in an array
- C) A fixed-size data structure that holds multiple values of the same type
- D) A resizable collection of objects that can grow and shrink