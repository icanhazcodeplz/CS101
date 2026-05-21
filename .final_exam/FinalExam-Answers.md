# CS101 Final Exam - Answers

**1. What directory is the *parent* of folder `lab2` in the diagram below?**
```
projects
├── java
│     ├── HelloWorld.java
│     └── lab2
│          └── Lab2.java
└── notes.txt
```
- A) `projects`
- *answer* **B) `java`**
- C) `lab2`
- D) `Lab2.java`

> **Rationale:** A parent directory is the folder immediately above a given item. `lab2` sits directly inside `java`, so `java` is its parent. `projects` is one level higher (a grandparent), and `Lab2.java` is a file *inside* `lab2`.

---

**2. What is the decimal value of the binary number `1010`?**

- A) 5
- B) 8
- *answer* **C) 10**
- D) 12

> **Rationale:** Each binary digit represents a power of 2 (from right to left: 1, 2, 4, 8). `1010` = (1×8) + (0×4) + (1×2) + (0×1) = 8 + 2 = **10**.

---

**3. How many bits are in one byte?**

- A) 4
- *answer* **B) 8**
- C) 16
- D) 10

> **Rationale:** By definition, a **byte** is a group of **8 bits**. One byte can represent 2^8 = 256 different values.

---

**4. What is the minimum number of binary digits (bits) needed to represent all 12 months of the year?**

- A) 3
- *answer* **B) 4**
- C) 6
- D) 12

> **Rationale:** With *n* bits you can represent 2^n distinct values. 2^3 = 8 (not enough for 12 months), 2^4 = 16 (enough). So you need at least **4 bits**.

---

**5. About how many bytes are in a kilobyte (KB)?**

- *answer* **A) Thousand**
- B) Million
- C) Billion
- D) Trillion

> **Rationale:** Storage prefixes: Kilo ≈ thousand, Mega ≈ million, Giga ≈ billion, Tera ≈ trillion. So 1 KB ≈ 1,000 bytes.

---

**6. What is printed?**
```java
int a = 7;
int b = 2;
System.out.println(a / b);
```
- A) `3.5`
- *answer* **B) `3`**
- C) `4`
- D) `7`

> **Rationale:** When both operands are `int`, Java performs **integer division** and discards any decimal remainder. `7 / 2` is `3.5` mathematically, but `int` division truncates to `3`.

---

**7. What is the value of `result`?**
```java
int result = 10 + 4 / 2;
```
- A) 7
- *answer* **B) 12**
- C) 10
- D) 14

> **Rationale:** Division has higher precedence than addition, so `4 / 2` is evaluated first to get `2`. Then `10 + 2 = 12`.

---

**8. Which of the following correctly declares an integer variable named `count` initialized to `0`?**

- A) `int count;`
- B) `count = 0;`
- *answer* **C) `int count = 0;`**
- D) `integer count = 0;`

> **Rationale:** A full declaration needs a type, a name, and (for initialization) a value. `int count;` declares but does not initialize. `count = 0;` assigns but doesn't declare a type. `integer` is not a valid Java primitive type — the correct keyword is `int`.

---

**9. What is printed?**
```java
double x = 5.0;
double y = 2.0;
System.out.println(x / y);
```
- A) `2`
- B) `2.0`
- *answer* **C) `2.5`**
- D) `3`

> **Rationale:** Both operands are `double`, so Java performs floating-point division. `5.0 / 2.0 = 2.5`.

---

**10. What is printed?**
```java
int score = 10;
score += 5;
score -= 3;
System.out.println(score);
```
- A) 10
- B) 3
- C) 18
- *answer* **D) 12**

> **Rationale:** `score += 5` is shorthand for `score = score + 5`, giving `15`. Then `score -= 3` is `score = score - 3`, giving `12`.

---

**11. What is the value of `result`?**
```java
int result = 2 + 3 * 4 - 1;
```
- A) 19
- *answer* **B) 13**
- C) 14
- D) 11

> **Rationale:** Multiplication happens first: `3 * 4 = 12`. Then left-to-right: `2 + 12 - 1 = 13`.

---

**12. What is printed?**
```java
double d = 9.99;
int i = (int) d;
System.out.println(i);
```
- A) `10`
- B) `9.99`
- *answer* **C) `9`**
- D) Compile error

> **Rationale:** Casting a `double` to an `int` **truncates** the decimal part (it does *not* round). `9.99` becomes `9`.

---

**13. What is printed?**
```java
System.out.println("They said \"hello\"");
```
- *answer* **A) `They said "hello"`**
- B) `They said \"hello\"`
- C) `They said hello`
- D) Compile error

> **Rationale:** `\"` is an **escape sequence** that represents a literal double-quote character inside a String. So `\"hello\"` prints as `"hello"`.

---

**14. What is printed?**
```java
int a = 5;
int b = 2;
double result = (double) a / b;
System.out.println(result);
```
- A) `2.0`
- *answer* **B) `2.5`**
- C) `2`
- D) `3.0`

> **Rationale:** The cast `(double) a` happens first, turning `a` into `5.0`. Then `5.0 / 2` uses floating-point division (since one operand is a `double`) to produce `2.5`.

---

**15. What is printed?**
```java
System.out.print("Hello ");
System.out.print("World");
```
- A) `Hello` then `World` on a new line
- B) `HelloWorld`
- *answer* **C) `Hello World`**
- D) `Hello\nWorld`

> **Rationale:** `System.out.print()` does **not** add a newline. The first call prints `"Hello "` (including the trailing space) and the second prints `"World"` immediately after, producing `Hello World`.

---

**16. What is printed?**
```java
System.out.println("line1\nline2");
```
- A) `line1\nline2`
- B) `line1 line2`
- *answer* **C) `line1` then `line2` on the next line**
- D) Compile error

> **Rationale:** `\n` is the **newline** escape sequence. It is interpreted as a line break, so the output splits across two lines.

---

**17. What is printed?**
```java
int x = 5;
boolean result = (x > 3) && (x < 10);
System.out.println(result);
```
- *answer* **A) `true`**
- B) `false`

> **Rationale:** `(5 > 3)` is `true` and `(5 < 10)` is `true`. `true && true` is `true`.

---

**18. What is printed?**
```java
int x = 15;
boolean result = (x < 5) || (x > 10);
System.out.println(result);
```
- A) `false`
- *answer* **B) `true`**

> **Rationale:** `||` (OR) returns `true` if **at least one** side is true. `(15 < 5)` is `false`, but `(15 > 10)` is `true`, so the result is `true`.

---

**19. What is printed?**
```java
boolean flag = false;
System.out.println(!flag);
```
- A) `false`
- *answer* **B) `true`**

> **Rationale:** `!` (NOT) flips a boolean. `!false` is `true`.

---

**20. What is the value of `result`?**
```java
int a = 4;
boolean result = a > 2 && a < 6 || a == 10;
```
- A) `false`
- *answer* **B) `true`**

> **Rationale:** `&&` has higher precedence than `||`, so the expression is `(a > 2 && a < 6) || (a == 10)`. With `a = 4`: `(true && true) || false` = `true || false` = `true`.

---

**21. Which boolean expression will always evaluate to `false`, regardless of the value of `x`?**

- A) `x > 5 && x < 10`
- *answer* **B) `x > 5 && x < 3`**
- C) `x > 5 || x < 10`
- D) `x > 5 || x > 3`

> **Rationale:** No number can be both greater than 5 **and** less than 3 at the same time, so `x > 5 && x < 3` is always `false`. The other expressions can be true for some values of `x`.

---

**22. What is printed?**
```java
int x = 10;
if (x > 5) {
    System.out.println("greater than 5");
}
if (x > 8) {
    System.out.println("greater than 8");
}
```
- A) `greater than 5`
- B) `greater than 8`
- *answer* **C) `greater than 5` then `greater than 8` on the next line**
- D) Nothing

> **Rationale:** These are two **separate** `if` statements (not an `if/else if`), so each is evaluated independently. With `x = 10`, both conditions are true, so both lines print.

---

**23. What is printed?**
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
- A) `big`
- *answer* **B) `medium`**
- C) `small`
- D) Nothing

> **Rationale:** `7 > 5` is true, so we enter the outer `if`. Inside, `7 > 10` is false, so the inner `else` runs and prints `medium`.

---

**24. What is printed?**
```java
int temp = 30;
if (temp > 100) {
    System.out.println("boiling");
} else if (temp > 70) {
    System.out.println("hot");
}
```
- A) `boiling`
- B) `hot`
- C) `boiling` then `hot`
- *answer* **D) Nothing is printed**

> **Rationale:** `30 > 100` is false and `30 > 70` is also false. There is no `else` clause, so nothing prints.

---

**25. What is printed?**
```java
int x = 10;
if (x > 5) {
    System.out.println("A");
} else if (x > 8) {
    System.out.println("B");
}
```
- *answer* **A) `A`**
- B) `B`
- C) `A` then `B`
- D) Nothing

> **Rationale:** In an `if/else if` chain, **only the first** matching branch runs. `10 > 5` is true, so `A` is printed, and the `else if` is skipped — even though `10 > 8` is also true.

---

**26. What is printed?**
```java
int age = 20;
boolean knowsPpl = false;

if (age > 20 || knowsPpl) {
    System.out.println("allowed");
} else {
    System.out.println("denied");
}
```
- A) `allowed`
- *answer* **B) `denied`**
- C) Compile error
- D) Nothing

> **Rationale:** `20 > 20` is `false` (`>` is strictly greater, not greater-or-equal) and `knowsPpl` is `false`. `false || false` is `false`, so the `else` branch runs.

---

**27. What is printed?**
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
- A) `It's blue`
- *answer* **B) `It's red`**
- C) `Unknown color`
- D) Compile error

> **Rationale:** `toLowerCase()` converts `"Red"` to `"red"`. The first check (`"red".equals("blue")`) is false, but the second (`"red".equals("red")`) is true, so `It's red` prints.

---

**28. What is printed?**
```java
for (int i = 0; i < 5; i++) {
    System.out.print(i + " ");
}
```
- *answer* **A) `0 1 2 3 4 `**
- B) `1 2 3 4 5 `
- C) `0 1 2 3 4 5 `
- D) `1 2 3 4 `

> **Rationale:** The loop starts at `i = 0` and continues **while** `i < 5`. So it runs with `i` equal to `0, 1, 2, 3, 4` and then stops.

---

**29. What is printed?**
```java
int n = 1;
while (n <= 5) {
    System.out.print(n + " ");
    n++;
}
```
- A) `1 2 3 4 5 6 `
- B) `1 2 3 4 `
- *answer* **C) `1 2 3 4 5 `**
- D) `0 1 2 3 4 5 `

> **Rationale:** The loop runs while `n <= 5`, printing `1, 2, 3, 4, 5`. When `n` becomes `6`, the condition fails and the loop ends.

---

**30. What is printed?**
```java
int x = 10;
do {
    System.out.println("hello");
    x++;
} while (x < 5);
```
- A) `hello` is printed infinitely
- B) `hello` is printed 5 times
- *answer* **C) `hello` is printed once**
- D) Nothing is printed

> **Rationale:** A `do-while` loop **always executes its body at least once** before checking the condition. After printing once, `x` is `11`, which is not `< 5`, so the loop exits.

---

**31. What is printed?**
```java
int sum = 0;
for (int i = 1; i <= 4; i++) {
    sum += i;
}
System.out.println(sum);
```
- A) 4
- B) 6
- *answer* **C) 10**
- D) 12

> **Rationale:** The loop adds `1 + 2 + 3 + 4` to `sum`. The total is `10`.

---

**32. What is printed?**
```java
for (int i = 0; i <= 10; i += 3) {
    System.out.print(i + " ");
}
```
- *answer* **A) `0 3 6 9 `**
- B) `0 3 6 9 12 `
- C) `3 6 9 12 `
- D) `0 3 6 9 10 `

> **Rationale:** Starting at `0` and adding `3` each iteration: `0, 3, 6, 9`. The next value would be `12`, but `12 <= 10` is false, so the loop stops.

---

**33. What is printed?**
```java
int count = 5;
while (count > 0) {
    System.out.print(count + " ");
    count--;
}
```
- A) `5 4 3 2 1 0 `
- *answer* **B) `5 4 3 2 1 `**
- C) `4 3 2 1 0 `
- D) Compile error

> **Rationale:** The loop prints the value, then decrements. It runs with `count = 5, 4, 3, 2, 1`. When `count` becomes `0`, the condition `count > 0` fails and the loop ends.

---

**34. How many asterisks (`*`) are printed in total?**
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
- *answer* **D) 6**

> **Rationale:** The outer loop runs **2** times and the inner loop runs **3** times per outer iteration. Total: 2 × 3 = **6** asterisks.

---

**35. What is printed?**
```java
int[] nums = {2, 4, 6, 8};
for (String s : nums) {
    System.out.print(s + " ");
}
```
- A) `0 1 2 3 `
- B) `2 4 6 8 `
- C) `2 4 6 8 10 `
- *answer* **D) Compile error**

> **Rationale:** The array holds `int` values, but the enhanced `for` loop tries to assign each element to a `String`. The types are incompatible, so the code does not compile.

---

**36. What is printed?**
```java
for (int i = 0; i < 3; i++) {
    int x = i * 2;
}
System.out.println(x);
```
- A) `4`
- B) `6`
- C) `0`
- *answer* **D) Compile error**

> **Rationale:** `x` is declared **inside** the `for` loop's body, so its scope ends when the loop ends. The `println` outside the loop cannot see `x`, causing a compile error.

---

**37. What is printed?**
```java
int score = 85;
if (score >= 80) {
    String grade = "B";
}
System.out.println(grade);
```
- A) `B`
- B) `85`
- C) `null`
- *answer* **D) Compile error**

> **Rationale:** `grade` is declared inside the `if` block, so its scope is limited to that block. The `println` outside cannot access it — a compile error.

---

**38. What is printed?**
```java
String result = "";
for (int i = 1; i <= 3; i++) {
    result = result + i;
}
System.out.println(result);
```
- A) `6`
- B) `1 2 3`
- *answer* **C) `123`**
- D) `+1+2+3`

> **Rationale:** The `+` operator with a String performs **concatenation**, not addition. Each loop iteration appends the digit as a character: `"" → "1" → "12" → "123"`.

---

**39. What is printed?**
```java
public static void farewell(String name) {
    System.out.println("Goodbye, " + name + "!");
}

public static void main(String[] args) {
    farewell("Bob");
}
```
- A) `Goodbye, !`
- B) `Goodbye, name!`
- *answer* **C) `Goodbye, Bob!`**
- D) Compile error

> **Rationale:** When `farewell("Bob")` is called, the argument `"Bob"` is bound to the parameter `name`. The method concatenates `"Goodbye, "` + `"Bob"` + `"!"` to produce `Goodbye, Bob!`.

---

**40. What is printed?**
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
- *answer* **C) 15**
- D) 555

> **Rationale:** `triple(5)` returns `5 * 3 = 15`, which is then printed.

---

**41. In the code below, what is `42`?**
```java
public static void printNum(int num) {
    System.out.println(num);
}

public static void main(String[] args) {
    printNum(42);
}
```
- A) A parameter
- *answer* **B) An argument**
- C) A return type
- D) A method name

> **Rationale:** An **argument** is the actual value passed in when a method is *called*. A **parameter** is the variable in the method's *definition* (`num` here). So `42` is an argument; `num` is the parameter that receives it.

---

**42. What is printed?**
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
- *answer* **C) 10**
- D) 24

> **Rationale:** The inner call is evaluated first: `mult(2, 3)` returns `6`. Then `add(4, 6)` returns `10`.

---

**43. What is the return type of the following method?**
```java
public static String repeat(String s, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
        result += s;
    }
    return result;
}
```
- A) `int`
- B) `result`
- *answer* **C) `String`**
- D) `static`

> **Rationale:** The return type is the keyword right before the method name in the signature. Here, that's `String`. `static` is a modifier and `result` is a local variable, not a type.

---

**44. What is printed?**
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
- *answer* **C) 11**
- D) 12

> **Rationale:** With `x = 4`: `y = 4 * 2 = 8`, then `y += 3` makes `y = 11`. The method returns `11`.

---

**45. What is printed?**
```java
int[] nums = {10, 20, 30, 40, 50};
System.out.println(nums[2]);
```
- A) 10
- B) 20
- *answer* **C) 30**
- D) 40

> **Rationale:** Arrays are **zero-indexed**, so `nums[0] = 10`, `nums[1] = 20`, `nums[2] = 30`.

---

**46. What is printed?**
```java
int[] nums = {0, 1, 2, 3};
System.out.println(nums.length);
```
- A) `[0, 1, 2, 3]`
- B) `3`
- *answer* **C) `4`**
- D) compile error

> **Rationale:** `.length` returns the **number of elements**, not the largest index. There are 4 elements in the array.

---

**47. What is printed?**
```java
int[] nums = {1, 2, 3};
nums[1] = 99;
System.out.println(nums[1]);
```
- A) 1
- B) 2
- C) 3
- *answer* **D) 99**

> **Rationale:** `nums[1] = 99` overwrites the value at index 1 (which was `2`). After the assignment, `nums[1]` is `99`.

---

**48. What is printed?**
```java
int[] arr = {5, 10, 15, 20};
System.out.println(arr[arr.length - 1]);
```
- A) 5
- B) 10
- C) 15
- *answer* **D) 20**

> **Rationale:** `arr.length` is `4`, so `arr.length - 1` is `3`. `arr[3]` is the last element, `20`. This is a common idiom for accessing the last element of an array.

---

**49. What is printed?**
```java
int[] nums = {1, 2, 3, 4};
System.out.println(nums[4]);
```
- A) `3`
- B) `4`
- C) `null`
- *answer* **D) Runtime error**

> **Rationale:** The valid indices for a 4-element array are `0` through `3`. Accessing `nums[4]` throws an `ArrayIndexOutOfBoundsException` at runtime.

---

**50. What is printed?**
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
- *answer* **D) 50**

> **Rationale:** The loop sums each element: `10 + 30 + 10 = 50`. Because `s` is an `int` (not a `String`), the `+=` operator adds numerically rather than concatenating.

---

**51. What is printed?**
```java
ArrayList<String> list = new ArrayList<String>();
list.add("cat");
list.add("dog");
list.add("fish");
System.out.println(list.size());
```
- A) 2
- *answer* **B) 3**
- C) 4
- D) 0

> **Rationale:** Three items were added, so `list.size()` returns `3`.

---

**52. What is printed?**
```java
ArrayList<Integer> nums = new ArrayList<Integer>();
nums.add(10);
nums.add(20);
nums.add(30);
System.out.println(nums.get(1));
```
- A) 10
- *answer* **B) 20**
- C) 30
- D) 1

> **Rationale:** ArrayLists are **zero-indexed** like arrays. `nums.get(1)` returns the element at index 1, which is `20`.

---

**53. What is printed?**
```java
ArrayList<String> colors = new ArrayList<String>();
colors.add("red");
colors.add("green");
colors.add("blue");
colors.remove(0);
System.out.println(colors.get(0));
```
- A) `red`
- *answer* **B) `green`**
- C) `blue`
- D) Compile error

> **Rationale:** `remove(0)` removes the first element (`"red"`). The remaining items shift down, so `"green"` is now at index 0.

---

**54. What is printed?**
```java
ArrayList<String> list = new ArrayList<String>();
list.add("hello");
list.add("world");
System.out.println(list.contains("Hello"));
```
- A) `0`
- B) `true`
- *answer* **C) `false`**
- D) `Hello`

> **Rationale:** `.contains()` is **case-sensitive**. The list has `"hello"` (lowercase), not `"Hello"`, so it returns `false`.

---

**55. What is printed?**
```java
String s = "Hello, World!";
System.out.println(s.toUpperCase());
```
- *answer* **A) `HELLO, WORLD!`**
- B) `Hello, World!`
- C) `hello, world!`
- D) `false`

> **Rationale:** `.toUpperCase()` returns a new String with every letter converted to uppercase. Punctuation is unchanged.

---

**56. What is printed?**
```java
String text = "I love Java!";
System.out.println(text.endsWith("e Java!"));
```
- *answer* **A) `true`**
- B) `false`
- C) `e Java!`
- D) `7`

> **Rationale:** `.endsWith()` checks whether the String ends with the given sequence. `"I love Java!"` does end with `"e Java!"` (the final 7 characters match), so the result is `true`.

---

**57. What is printed?**
```java
String s = "banana";
String result = s.replace("a", "o");
System.out.println(s);
System.out.println(result);
```
- A) `bonono` then `bonono`
- *answer* **B) `banana` then `bonono`**
- C) `bonono` then `banana`
- D) `banana` then `banana`

> **Rationale:** Strings in Java are **immutable**. `.replace()` does not change `s`; it returns a *new* String, which is stored in `result`. So `s` is still `"banana"` and `result` is `"bonono"`.

---

**58. What is printed?**
```java
String csv = "apple,banana,cherry";
String[] parts = csv.split(",");
System.out.println(parts[2]);
```
- A) `apple`
- B) `banana`
- *answer* **C) `cherry`**
- D) `applebananacherry`

> **Rationale:** `.split(",")` splits the String at every comma, returning `{"apple", "banana", "cherry"}`. Index 2 is the third element, `"cherry"`.

---

**59. Define *Graphical User Interface (GUI)*:**

- A) A text-based interface for typing commands directly to the shell
- B) Core part of the OS that directly manages hardware, memory, and processes
- C) Software designed for end-users to perform a specific task
- *answer* **D) A visual interface with windows, icons, and menus that users interact with using a mouse or touch**

> **Rationale:** A GUI uses **graphical** elements — windows, icons, buttons — instead of text commands. Option A describes a CLI, B describes the kernel, and C describes an application.

---

**60. Define *Unicode*:**

- A) A character encoding that represents 128 characters using 7 bits
- B) A color model that combines red, green, and blue light values
- *answer* **C) A universal character encoding standard that supports characters from all writing systems, including emojis**
- D) A plain-text file format where fields are separated by commas

> **Rationale:** Unicode is the modern universal character encoding standard that supports every writing system plus symbols and emojis. Option A describes ASCII, B describes RGB, and D describes CSV.

---

**61. Define *concatenation*:**

- A) Converting a value from one data type to another
- B) Analyzing a string and splitting it into usable components
- C) Treating uppercase and lowercase letters as different characters
- *answer* **D) Joining two or more strings together using the `+` operator**

> **Rationale:** Concatenation in Java means joining Strings with `+`. Option A describes type casting/conversion, B describes parsing, and C describes case sensitivity.

---

**62. Define *Java Primitive*:**

- A) A resizable collection of objects that can grow and shrink
- B) A named, reusable block of code that performs a specific task
- *answer* **C) A basic built-in data type that stores a simple value directly in memory**
- D) Intermediate, platform-independent code that runs on the JVM

> **Rationale:** Java's primitive types (`int`, `double`, `boolean`, `char`, etc.) are the basic built-in types that store values directly. Option A describes an ArrayList, B describes a method, and D describes Java bytecode.

---

**63. Define *Transistor*:**

- A) An electronic component that controls electric current flow inside a glass bulb
- B) A material that can sometimes conduct electricity and sometimes resist it
- C) A mechanical calculator capable of the four basic arithmetic operations
- *answer* **D) An electronic switch made of semiconductor material, smaller and faster than vacuum tubes**

> **Rationale:** A transistor is a tiny electronic switch made of semiconductor material that replaced vacuum tubes. Option A describes a vacuum tube, B describes a semiconductor (the material, not the device), and C describes early mechanical calculators.

---

**64. Define *Method Call*:**

- A) A variable listed in a method's definition that acts as a placeholder for a value
- B) The data type of the value a method sends back to the caller
- *answer* **C) Executing a method by writing its name followed by parentheses with any required arguments**
- D) The actual value passed to a method when it is invoked

> **Rationale:** A method call *runs* the method by writing its name with parentheses (e.g., `farewell("Bob")`). Option A describes a parameter, B describes a return type, and D describes an argument.

---

**65. Define *Element*:**

- A) The position of a value in an array, starting at 0
- *answer* **B) A single value stored at a specific index in an array**
- C) A fixed-size data structure that holds multiple values of the same type
- D) A resizable collection of objects that can grow and shrink

> **Rationale:** An *element* is one of the values stored in an array. Option A describes an index, C describes an array itself, and D describes an ArrayList.

---
