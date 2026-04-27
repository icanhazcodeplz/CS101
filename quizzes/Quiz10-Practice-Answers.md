# CS101 Quiz 10 - Practice - Answers
### Covers:
 - The `ArrayLists` part of [Topic 12: ArrayLists & File I/O](https://github.com/icanhazcodeplz/CS101) 
 - [lab13_ArrayList](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab13_arrayList/lab13_ArrayList.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. What does this code print?**
```java
ArrayList<String> names = new ArrayList<String>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
System.out.println(names.get(1));
```
- *answer* **A) `Bob`**
- B) `Alice`
- C) `Charlie`
- D) Compile error

> **Rationale:** `.get(1)` returns the element at index 1. Like arrays, ArrayList indices start at 0, so index 1 is `"Bob"`.

---

**2. What does this code print?**
```java
ArrayList<String> colors = new ArrayList<String>();
colors.add("red");
colors.add("green");
colors.add("blue");
colors.set(0, "yellow");
colors.remove("green");
System.out.println(colors);
```
- A) `[yellow, green, blue]`
- B) `[red, blue]`
- *answer* **C) `[yellow, blue]`**
- D) `[yellow, green]`

> **Rationale:** `.set(0, "yellow")` changes index 0 from `"red"` to `"yellow"`. Then `.remove("green")` removes `"green"` from the list. The remaining elements are `[yellow, blue]`.

---

**3. What does this code print?**
```java
ArrayList<String> items = new ArrayList<String>();
items.add("A");
items.add("B");
items.add("C");
items.add("D");
System.out.println(items.size());
```
- A) `3`
- *answer* **B) `4`**
- C) `5`
- D) Compile error

> **Rationale:** `.size()` returns the number of elements in the ArrayList. Four items were added, so it returns `4`. Note: ArrayLists use `.size()` (with parentheses), while arrays use `.length` (no parentheses).

---

**4. What does this code print?**
```java
ArrayList<String> pets = new ArrayList<String>();
pets.add("cat");
pets.add("dog");
pets.add("fish");
for (String p : pets) {
    System.out.print(p + " ");
}
```
- A) `0 1 2`
- *answer* **B) `cat dog fish`**
- C) `cat, dog, fish`
- D) Compile error

> **Rationale:** A for-each loop iterates over each element in the ArrayList. The variable `p` takes the value of each element (`"cat"`, then `"dog"`, then `"fish"`), not the index.

---

**5. What does this code print?**
```java
ArrayList<String> fruits = new ArrayList<String>();
fruits.add("apple");
fruits.add("banana");
fruits.add("cherry");
System.out.println(fruits.contains("orange"));
```
- *answer* **A) `false`**
- B) `true`
- C) `1`
- D) Compile error

> **Rationale:** `.contains("orange")` returns `false` because `"orange"` is not in the list.

---

**6. Define "ArrayList":**

- A) A fixed-size collection of elements accessed by index
- *answer* **B) A resizable collection of objects that can grow and shrink as elements are added or removed**
- C) A method that reads data from a file
- D) A type of loop used to iterate over collections

> **Rationale:** Unlike a regular array (fixed size), an ArrayList can grow and shrink dynamically. You can add or remove elements at any time using `.add()`, `.remove()`, etc.

