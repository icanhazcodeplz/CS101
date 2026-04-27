### CS101 Quiz 10
There are 10 points possible. The score will be out of 10.

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

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
- C) `Seattle`
- D) `null`

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
- B) `[fish, bird]`
- C) `[cat, dog, bird]`
- D) `[fish, dog, bird]`

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
- A) `5`
- B) `4`
- C) `50`
- D) `150`

<div style="page-break-before: always;"></div>

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
- B) `1 2 3`
- C) `[1, 2, 3]`
- D) `3 2 1`

**5. (2pts) What does this code print?**
```java
ArrayList<String> sports = new ArrayList<String>();
sports.add("soccer");
sports.add("tennis");
sports.add("hockey");
System.out.println(sports.contains("tennis"));
```
- A) `true`
- B) `false`
- C) `1`
- D) `tennis`

**6. (1pt) Define "Concatenation":**

- A) Converting a String into an int using `Integer.parseInt`
- B) Comparing two Strings to check if they are equal
- C) Splitting a String into an array of smaller Strings
- D) Joining two or more strings together using the `+` operator
