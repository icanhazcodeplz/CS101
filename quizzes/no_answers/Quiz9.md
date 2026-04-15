### CS101 Quiz 9
There are 10 points possible. The score will be out of 10.

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. (1pt) What does this code print?**
```java
String[] words = new String[2];
words[0] = "hi";
words[1] = "bye";
System.out.println(words[0] + " " + words[1]);
```
- A) `hi bye`
- B) `bye hi`
- C) `null null`
- D) Compile error

**2. (1pt) What does this code print?**
```java
int[] vals = {3, 6, 9, 12, 15};
System.out.println(vals[3]);
```
- A) `3`
- B) `9`
- C) `12`
- D) `15`

**3. (1pt) What does this code print?**
```java
String[] colors = {"red", "blue", "green", "yellow", "purple"};
System.out.println(colors[2]);
```
- A) `red`
- B) `blue`
- C) `green`
- D) `yellow`

**4. (1pt) What does this code print?**
```java
int[] nums = {8, 16, 24};
nums[2] = 50;
System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
```
- A) `8 16 24`
- B) `50 16 24`
- C) Compile error
- D) `8 16 50`

**5. (1pt) What does this code print?**
```java
String[] fruits = {"apple", "banana", "cherry", "date"};
System.out.println(fruits.length);
```
- A) `3`
- B) `4`
- C) `5`
- D) Compile error

<div style="page-break-before: always;"></div>

**6. (1pt) What does this code print?**
```java
int[] nums = {7, 14, 21};
for (int x : nums) {
    System.out.print(x + " ");
}
```
- A) `0 1 2`
- B) `7 14 21 28`
- C) `7 14 21`
- D) Compile error

**7. (1pt) What does this code print?**
```java
int[] nums = {3, 7, 10};
int sum = 0;
for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
}
System.out.println(sum);
```
- A) `3`
- B) `10`
- C) `20`
- D) `0`

**8. (1pt) What does this code print?**
```java
int[][] grid = {
    {9, 8, 7},
    {6, 5, 4}
};
System.out.println(grid[1][2]);
```
- A) `8`
- B) `4`
- C) `6`
- D) `5`

**9. (1pt) What does this code print?**
```java
int[][] grid = {
    {2, 4, 6},
    {8, 10, 12},
    {14, 16, 18},
    {20, 22, 24}
};
System.out.println(grid[2][1]);
```
- A) `14`
- B) `18`
- C) `16`
- D) `10`

**10. (1pt) Define "Element":**

- A) The position number used to access a value in an array
- B) A single value stored at a specific position in an array
- C) The keyword used to create a new array
- D) The total number of values an array can hold