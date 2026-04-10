# CS101 Quiz 9 - Answers
### Covers:
 - [Topic 11: Arrays & Multidimensional Arrays](https://github.com/icanhazcodeplz/CS101)
 - [lab11_Arrays](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab11_arrays/lab11_Arrays.java) and [lab12_Arrays2d](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab12_arrays2d/lab12_Arrays2d.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. What does this code print?**
```java
String[] words = new String[2];
words[0] = "hi";
words[1] = "bye";
System.out.println(words[0] + " " + words[1]);
```
- *answer* **A) `hi bye`**
- B) `bye hi`
- C) `null null`
- D) Compile error

> **Rationale:** `new String[2]` creates an empty String array with room for 2 elements (both initially `null`). The next two lines assign `"hi"` to index 0 and `"bye"` to index 1, so printing them in order gives `hi bye`.

---

**2. What does this code print?**
```java
int[] vals = {3, 6, 9, 12, 15};
System.out.println(vals[3]);
```
- A) `3`
- B) `9`
- *answer* **C) `12`**
- D) `15`

> **Rationale:** Array indices start at 0. `vals[0]` is 3, `vals[1]` is 6, `vals[2]` is 9, `vals[3]` is 12.

---

**3. What does this code print?**
```java
String[] colors = {"red", "blue", "green", "yellow", "purple"};
System.out.println(colors[2]);
```
- A) `red`
- B) `blue`
- *answer* **C) `green`**
- D) `yellow`

> **Rationale:** Array indices start at 0, so `colors[0]` is `"red"`, `colors[1]` is `"blue"`, and `colors[2]` is `"green"`. Indexing works the same way for String arrays as for int arrays.

---

**4. What does this code print?**
```java
int[] nums = {8, 16, 24};
nums[2] = 50;
System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
```
- A) `8 16 24`
- B) `50 16 24`
- C) Compile error
- *answer* **D) `8 16 50`**

> **Rationale:** `nums[2] = 50` changes the element at index 2 from 24 to 50. The other elements are unchanged.

---

**5. What does this code print?**
```java
String[] fruits = {"apple", "banana", "cherry", "date"};
System.out.println(fruits.length);
```
- A) `3`
- *answer* **B) `4`**
- C) `5`
- D) Compile error

> **Rationale:** `.length` returns the number of elements in the array. There are 4 strings in `fruits`, so it prints `4`. Note: `.length` is not a method call (no parentheses) for arrays.

---

**6. What does this code print?**
```java
int[] nums = {7, 14, 21};
for (int x : nums) {
    System.out.print(x + " ");
}
```
- A) `0 1 2`
- B) `7 14 21 28`
- *answer* **C) `7 14 21`**
- D) Compile error

> **Rationale:** A for-each loop iterates over each element in the array. The variable `x` takes the value of each element (7, then 14, then 21), not the index.

---

**7. What does this code print?**
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
- *answer* **C) `20`**
- D) `0`

> **Rationale:** The loop adds each element: 3 + 7 + 10 = 20. Using `nums.length` in the condition ensures the loop visits every element without going out of bounds.

---

**8. What does this code print?**
```java
int[][] grid = {
    {9, 8, 7},
    {6, 5, 4}
};
System.out.println(grid[1][2]);
```
- A) `8`
- *answer* **B) `4`**
- C) `6`
- D) `5`

> **Rationale:** `grid[1]` is the second row `{6, 5, 4}`. `grid[1][2]` is the element at index 2 of that row, which is `4`.

---

**9. What does this code print?**
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
- *answer* **C) `16`**
- D) `10`

> **Rationale:** `grid[2]` is the third row `{14, 16, 18}`. `grid[2][1]` is the element at index 1 of that row, which is `16`. Remember: the first index is the row, the second is the column, and both start at 0.

---

**10. Define "Element":**

- A) The position number used to access a value in an array
- *answer* **B) A single value stored at a specific position in an array**
- C) The keyword used to create a new array
- D) The total number of values an array can hold

> **Rationale:** An element is one of the individual values stored in an array. For example, in `{5, 10, 15}`, the element at index 0 is 5.
