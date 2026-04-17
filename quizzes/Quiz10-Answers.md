# CS101 Quiz 10 - Answers
### Covers:
 - The `ArrayLists` part of [Topic 12: ArrayLists & File I/O](https://github.com/icanhazcodeplz/CS101) 
 - [lab13_ArrayList](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab13_arrayList/lab13_ArrayList.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. (1pt) What does this code print?**
```java
ArrayList<String> cities = new ArrayList<String>();
cities.add("Denver");
cities.add("Austin");
cities.add("Seattle");
System.out.println(cities.get(2));
```
- A) `Denver`
- B) `Austin`
- *answer* **C) `Seattle`**
- D) `null`

> **Rationale:** `.get(2)` returns the element at index 2. ArrayList indices start at 0, so index 2 is the third element, `"Seattle"`.

---

**2. (2pts) What does this code print?**
```java
ArrayList<String> animals = new ArrayList<String>();
animals.add("cat");
animals.add("dog");
animals.add("bird");
animals.set(1, "fish");
animals.remove("cat");
System.out.println(animals);
```
- A) `[cat, fish, bird]`
- *answer* **B) `[fish, bird]`**
- C) `[cat, dog, bird]`
- D) `[fish, dog, bird]`

> **Rationale:** `.set(1, "fish")` changes index 1 from `"dog"` to `"fish"`, giving `[cat, fish, bird]`. Then `.remove("cat")` removes `"cat"` from the list, leaving `[fish, bird]`.

---

**3. (2pts) What does this code print?**
```java
ArrayList<Integer> nums = new ArrayList<Integer>();
nums.add(10);
nums.add(20);
nums.add(30);
nums.add(40);
nums.add(50);
System.out.println(nums.size());
```
- *answer* **A) `5`**
- B) `4`
- C) `50`
- D) `150`

> **Rationale:** `.size()` returns the number of elements in the ArrayList. Five items were added, so it returns `5`. Remember: ArrayLists use `.size()` (with parentheses), while arrays use `.length` (no parentheses).

---

**4. (2pts) What does this code print?**
```java
ArrayList<Integer> nums = new ArrayList<Integer>();
nums.add(1);
nums.add(2);
nums.add(3);
for (int n : nums) {
    System.out.print(n + " ");
}
```
- A) `0 1 2`
- *answer* **B) `1 2 3`**
- C) `[1, 2, 3]`
- D) `3 2 1`

> **Rationale:** A for-each loop iterates over each element in the ArrayList. The variable `n` takes the value of each element (`1`, then `2`, then `3`), not the index.

---

**5. (2pts) What does this code print?**
```java
ArrayList<String> sports = new ArrayList<String>();
sports.add("soccer");
sports.add("tennis");
sports.add("hockey");
System.out.println(sports.contains("tennis"));
```
- *answer* **A) `true`**
- B) `false`
- C) `1`
- D) `tennis`

> **Rationale:** `.contains("tennis")` returns `true` because `"tennis"` is in the list.

---

**6. (1pt) Define "Concatenation":**

- A) Converting a String into an int using `Integer.parseInt`
- B) Comparing two Strings to check if they are equal
- C) Splitting a String into an array of smaller Strings
- *answer* **D) Joining two or more strings together using the `+` operator**

