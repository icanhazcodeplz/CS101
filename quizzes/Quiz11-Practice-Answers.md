# CS101 Quiz 11 - Practice - Answers
### Covers:
 - [Topic 13: String Methods](https://github.com/icanhazcodeplz/CS101)
 - [lab15_StringComparison](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab15_string_comparison/lab15_StringComparison.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. What does this code print?**
```java
String a = "Pikachu";
String b = "pikachu";
System.out.println(a.equals(b));
```
- A) `true`
- *answer* **B) `false`**
- C) `Pikachu`
- D) Compile error

> **Rationale:** `.equals()` is case-sensitive. `"Pikachu"` and `"pikachu"` differ in the first character (`P` vs `p`), so it returns `false`.

---

**2. What does this code print?**
```java
String a = "Eevee";
String b = "eevee";
System.out.println(a.equalsIgnoreCase(b));
```
- *answer* **A) `true`**
- B) `false`
- C) `Eevee`
- D) Compile error

> **Rationale:** `.equalsIgnoreCase()` compares the text while ignoring uppercase vs lowercase differences. `"Eevee"` and `"eevee"` have the same letters, so it returns `true`.

---

**3. What does this code print?**
```java
String s = "The quick brown fox";
System.out.println(s.contains("quick"));
System.out.println(s.contains("Quick"));
```
- A) `true` and `true`
- *answer* **B) `true` and `false`**
- C) `false` and `true`
- D) `false` and `false`

> **Rationale:** `.contains()` is case-sensitive. `"quick"` (lowercase) is found in the String, but `"Quick"` (uppercase Q) is not.

---

**4. What does this code print?**
```java
String s = "";
String t = "Squirtle";
System.out.println(s.isEmpty());
System.out.println(t.isEmpty());
```
- *answer* **A) `true` and `false`**
- B) `false` and `true`
- C) `true` and `true`
- D) Compile error

> **Rationale:** `.isEmpty()` returns `true` when a String has zero characters. `""` has length 0, so it returns `true`. `"Squirtle"` has 8 characters, so it returns `false`.

---

**5. What does this code print?**
```java
String s = "Charmander";
System.out.println(s.startsWith("Char"));
System.out.println(s.endsWith("der"));
```
- *answer* **A) `true` and `true`**
- B) `true` and `false`
- C) `false` and `true`
- D) `false` and `false`

> **Rationale:** `"Charmander"` starts with `"Char"` and ends with `"der"`, so both return `true`. These methods are case-sensitive.

---

**6. What does this code print?**
```java
String s = "Game Over";
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
```
- A) `Game Over` and `Game Over`
- B) `game over` and `GAME OVER`
- *answer* **C) `GAME OVER` and `game over`**
- D) Compile error

> **Rationale:** `.toUpperCase()` converts every character to uppercase. `.toLowerCase()` converts every character to lowercase. Neither method changes the original String.

---

**7. What does this code print?**
```java
String s = "I like cats";
String result = s.replace("cats", "dogs");
System.out.println(result);
System.out.println(s);
```
- A) `I like dogs` and `I like dogs`
- *answer* **B) `I like dogs` and `I like cats`**
- C) `I like cats` and `I like dogs`
- D) Compile error

> **Rationale:** `.replace()` returns a new String with the replacement made — it does not change the original. So `result` is `"I like dogs"` but `s` is still `"I like cats"`.

---

**8. What does this code print?**
```java
String data = "10,20,30,40";
String[] parts = data.split(",");
System.out.println(parts[2]);
System.out.println(parts.length);
```
- A) `20` and `4`
- B) `10` and `4`
- *answer* **C) `30` and `4`**
- D) Compile error

> **Rationale:** `.split(",")` breaks the String at each comma, producing the array `{"10", "20", "30", "40"}`. Index 2 is `"30"`, and the array has 4 elements.

---

**9. What does this code print?**
```java
String a = "Jigglypuff";
String b = new String("Jigglypuff");
System.out.println(a == b);
System.out.println(a.equals(b));
```
- A) `true` and `true`
- *answer* **B) `false` and `true`**
- C) `true` and `false`
- D) `false` and `false`

> **Rationale:** `==` compares memory references (whether they are the same object), not text content. `new String()` creates a separate object, so `==` returns `false`. `.equals()` compares the actual characters, so it returns `true`.

---

**10. What does this code print?**
```java
String s = "Bulbasaur";
System.out.println(s.startsWith("bulb"));
System.out.println(s.toLowerCase().startsWith("bulb"));
```
- A) `true` and `true`
- B) `true` and `false`
- C) `false` and `false`
- *answer* **D) `false` and `true`**

> **Rationale:** `.startsWith()` is case-sensitive. `"Bulbasaur"` starts with uppercase `"B"`, so `startsWith("bulb")` is `false`. Calling `.toLowerCase()` first converts it to `"bulbasaur"`, which does start with `"bulb"`.

---

**11. Define "Narrowing":**

- A) Automatically converting a smaller data type to a larger one with no data loss
- *answer* **B) Manually converting a larger data type to a smaller one, which may lose data**
- C) Removing whitespace from the beginning and end of a String
- D) Splitting a String into an array of smaller Strings

> **Rationale:** Narrowing is when you explicitly cast a larger type to a smaller one, e.g. `int x = (int) 9.99;` results in `9` because the decimal is truncated. This requires an explicit cast because data can be lost.
