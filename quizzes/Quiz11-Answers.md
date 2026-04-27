# CS101 Quiz 11 - Answers
### Covers:
 - [Topic 13: String Methods](https://github.com/icanhazcodeplz/CS101)
 - [lab15_StringComparison](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab15_string_comparison/lab15_StringComparison.java)
 - Any word on the CS101 Github [vocabulary.md](https://github.com/icanhazcodeplz/CS101/blob/main/vocabulary.md)

### During Quiz
 - Printed version of [Java Cheatsheet](https://github.com/icanhazcodeplz/CS101/blob/main/worksheets/java_cheatsheet.md)

---

**1. (1pt) What does this code print?**
```java
String a = "Omni-Man";
String b = "omni-man";
System.out.println(a.equals(b));
```
- A) `true`
- B) `Omni-Man`
- C) `omni-man`
- *answer* **D) `false`**

> **Rationale:** `.equals()` is case-sensitive. `"Omni-Man"` and `"omni-man"` differ in casing, so it returns `false`.

---

**2. (1pt) What does this code print?**
```java
String a = "Mewtwo";
String b = "mewtwo";
System.out.println(a.equalsIgnoreCase(b));
```
- *answer* **A) `true`**
- B) `false`
- C) `Mewtwo`
- D) `mewtwo`

> **Rationale:** `.equalsIgnoreCase()` ignores uppercase vs lowercase differences. `"Mewtwo"` and `"mewtwo"` have the same letters, so it returns `true`.

---

**3. (1pt) What does this code print?**
```java
String s = "Java is fun";
System.out.println(s.contains("is"));
System.out.println(s.contains("IS"));
```
- A) `true` and `true`
- B) `false` and `true`
- *answer* **C) `true` and `false`**
- D) `false` and `false`

> **Rationale:** `.contains()` is case-sensitive. `"is"` (lowercase) is found in the String, but `"IS"` (uppercase) is not.

---

**4. (1pt) What does this code print?**
```java
String s = "Invincible";
System.out.println(s.startsWith("Inv"));
System.out.println(s.endsWith("ble"));
```
- A) `false` and `false`
- *answer* **B) `true` and `true`**
- C) `true` and `false`
- D) `false` and `true`

> **Rationale:** `"Invincible"` starts with `"Inv"` and ends with `"ble"`, so both return `true`. These methods are case-sensitive.

---

**5. (1pt) What does this code print?**
```java
String s = "Level Up";
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
```
- A) `Level Up` and `Level Up`
- B) `level up` and `LEVEL UP`
- *answer* **C) `LEVEL UP` and `level up`**
- D) `Level up` and `level Up`

> **Rationale:** `.toUpperCase()` converts every character to uppercase. `.toLowerCase()` converts every character to lowercase. Neither method changes the original String.

---

**6. (1pt) What does this code print?**
```java
String s = "I love summer";
String result = s.replace("summer", "winter");
System.out.println(result);
System.out.println(s);
```
- *answer* **A) `I love winter` and `I love summer`**
- B) `I love winter` and `I love winter`
- C) `I love summer` and `I love winter`
- D) `I love summer` and `I love summer`

> **Rationale:** `.replace()` returns a new String with the replacement made — it does not change the original. So `result` is `"I love winter"` but `s` is still `"I love summer"`.

---

**7. (1pt) What does this code print?**
```java
String data = "math:science:english:history";
String[] classes = data.split(":");
System.out.println(classes[2]);
```
- A) `math`
- B) `science`
- C) `history`
- *answer* **D) `english`**

> **Rationale:** `.split(":")` breaks the String at each colon, producing `{"math", "science", "english", "history"}`. Index 2 is `"english"`.

---

**8. (1pt) What does this code print?**
```java
String a = "Rosebaum";
String b = new String("Rosebaum");
System.out.println(a == b);
System.out.println(a.equals(b));
```
- A) `true` and `true`
- *answer* **B) `false` and `true`**
- C) `true` and `false`
- D) `false` and `false`

> **Rationale:** `==` compares memory references (whether they are the same object), not text content. `new String()` creates a separate object, so `==` returns `false`. `.equals()` compares the actual characters, so it returns `true`.

---

**9. (1pt) What does this code print?**
```java
String s = "Gyarados";
System.out.println(s.startsWith("gyar"));
System.out.println(s.toLowerCase().startsWith("gyar"));
```
- *answer* **A) `false` and `true`**
- B) `true` and `true`
- C) `true` and `false`
- D) `false` and `false`

> **Rationale:** `.startsWith()` is case-sensitive. `"Gyarados"` starts with uppercase `"G"`, so `startsWith("gyar")` is `false`. Calling `.toLowerCase()` first converts it to `"gyarados"`, which does start with `"gyar"`.

---

**10. (1pt) Define "Hard-coded":**

- A) Code that has been compiled into machine language
- B) A program that is difficult to understand or modify
- *answer* **C) A value written directly into the source code rather than being computed or read from input**
- D) A variable that cannot be changed after it is declared

> **Rationale:** A hard-coded value is written directly in the code, like `int max = 100;`, instead of being provided by the user or calculated at runtime.
