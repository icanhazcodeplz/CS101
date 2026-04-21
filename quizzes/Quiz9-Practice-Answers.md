# CS101 Quiz 9 - Practice - Answers
### Covers:
 - [Topic 11: Arrays & Multidimensional Arrays](https://github.com/icanhazcodeplz/CS101)
 - [lab11_Arrays](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab11_arrays/lab11_Arrays.java) and [lab12_Arrays2d](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab12_arrays2d/lab12_Arrays2d.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. What does this code print?**
```java
int[] nums = {10, 20, 30, 40};
System.out.println(nums[2]);
```
- A) `10`
- B) `20`
- *answer* **C) `30`**
- D) `40`

> **Rationale:** Array indices start at 0. `nums[0]` is 10, `nums[1]` is 20, `nums[2]` is 30.

---

**2. What does this code print?**
```java
int[] nums = {5, 10, 15};
nums[1] = 99;
System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
```
- A) `5 10 15`
- *answer* **B) `5 99 15`**
- C) `99 10 15`
- D) Compile error

> **Rationale:** `nums[1] = 99` changes the element at index 1 from 10 to 99. The other elements are unchanged.

---

**3. What does this code print?**
```java
String[] colors = {"red", "green", "blue"};
System.out.println(colors.length);
```
- A) `4`
- *answer* **B) `3`**
- C) `2`
- D) Compile error

> **Rationale:** `.length` returns the number of elements in the array. There are 3 strings in `colors`, so it prints `3`. Note: `.length` is not a method call (no parentheses) for arrays.

---

**4. What does this code print?**
```java
int[] nums = {2, 4, 6};
for (int n : nums) {
    System.out.print(n + " ");
}
```
- A) `0 1 2`
- *answer* **B) `2 4 6`**
- C) `2 4 6 8`
- D) Compile error

> **Rationale:** A for-each loop iterates over each element in the array. The variable `n` takes the value of each element (2, then 4, then 6), not the index.

---

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
- *answer* **C) `14`**
- D) `0`

> **Rationale:** The loop adds each element: 5 + 8 + 1 = 14. Using `nums.length` in the condition ensures the loop visits every element without going out of bounds.

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
- *answer* **D) `6`**

> **Rationale:** `grid[1]` is the second row `{4, 5, 6}`. `grid[1][2]` is the element at index 2 of that row, which is `6`.

---

**7. Define "Index":**

- A) The total number of elements in an array
- B) The data type of elements stored in an array
- *answer* **C) The position number used to access an element in an array, starting at 0**
- D) The value stored at a specific position in an array

