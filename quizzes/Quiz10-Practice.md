### CS101 Quiz 10 - Practice

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. What does this code print?**
```java
ArrayList<String> names = new ArrayList<String>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
System.out.println(names.get(1));
```
- A) `Bob`
- B) `Alice`
- C) `Charlie`
- D) Compile error

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
- C) `[yellow, blue]`
- D) `[yellow, green]`

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
- B) `4`
- C) `5`
- D) Compile error

---

<div style="page-break-before: always;"></div>

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
- B) `cat dog fish`
- C) `cat, dog, fish`
- D) Compile error

---

**5. What does this code print?**
```java
ArrayList<String> fruits = new ArrayList<String>();
fruits.add("apple");
fruits.add("banana");
fruits.add("cherry");
System.out.println(fruits.contains("orange"));
```
- A) `false`
- B) `true`
- C) `1`
- D) Compile error

---

**6. Define "ArrayList":**

- A) A fixed-size collection of elements accessed by index
- B) A resizable collection of objects that can grow and shrink as elements are added or removed
- C) A method that reads data from a file
- D) A type of loop used to iterate over collections
