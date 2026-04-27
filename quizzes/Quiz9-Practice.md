### CS101 Quiz 9 - Practice

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. What does this code print?**
```java
int[] nums = {10, 20, 30, 40};
System.out.println(nums[2]);
```
- A) `10`
- B) `20`
- C) `30`
- D) `40`

---

**2. What does this code print?**
```java
int[] nums = {5, 10, 15};
nums[1] = 99;
System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
```
- A) `5 10 15`
- B) `5 99 15`
- C) `99 10 15`
- D) Compile error

---

**3. What does this code print?**
```java
String[] colors = {"red", "green", "blue"};
System.out.println(colors.length);
```
- A) `4`
- B) `3`
- C) `2`
- D) Compile error

---

**4. What does this code print?**
```java
int[] nums = {2, 4, 6};
for (int n : nums) {
    System.out.print(n + " ");
}
```
- A) `0 1 2`
- B) `2 4 6`
- C) `2 4 6 8`
- D) Compile error

---

<div style="page-break-before: always;"></div>

**5. What does this code print?**
```java
int[] nums = {5, 8, 1};
int sum = 0;
for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
}
System.out.println(sum);
```
- A) `5`
- B) `13`
- C) `14`
- D) `0`

---

**6. What does this code print?**
```java
int[][] grid = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(grid[1][2]);
```
- A) `2`
- B) `3`
- C) `5`
- D) `6`

---

**7. Define "Index":**

- A) The total number of elements in an array
- B) The data type of elements stored in an array
- C) The position number used to access an element in an array, starting at 0
- D) The value stored at a specific position in an array
