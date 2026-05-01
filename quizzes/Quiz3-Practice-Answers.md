# CS101 Quiz 3 - Practice - Answers

**Covers**:
- Anything From **Lab3Variables**
- Assignment Operators: See slides **2/3-User-Input**
- Any word on the CS101 Github `vocabulary.md` file

**During Quiz:**
- NO NOTES

---

**Use the code below to answer questions 1 - 3:**

```java
public class arithmetic {
    public static void main(String[] args) {
        double x = 4.0;
        double y = 10.0;
        double z = (x * y) / 2.0 - 5.0;
        System.out.println(z);

        x = x - 1.0;
        x = 233.5;
        y -= 1.0;
    }
}
```

**1. (2pts) If we run this code, what will be printed to the console?**

- A) `20.0`
- B) `4.0`
- C) `37.5`
- *answer* **D) `15.0`**

> **Rationale:** `z = (x * y) / 2.0 - 5.0` = `(4.0 * 10.0) / 2.0 - 5.0` = `40.0 / 2.0 - 5.0` = `20.0 - 5.0` = `15.0`. Multiplication and division are evaluated left to right before subtraction.

---

**2. (2pts) What is the value of `x` when the program completes?**

- A) `4.0`
- B) `3.0`
- *answer* **C) `233.5`**
- D) `232.5`

> **Rationale:** `x = x - 1.0` changes `x` to `3.0`, but `x = 233.5` immediately overwrites it. The last assignment wins — final `x` is `233.5`.

---

**3. (2pts) What is the value of `y` when the program completes?**

- A) `10.0`
- B) `11.0`
- C) `1.0`
- *answer* **D) `9.0`**

> **Rationale:** `y -= 1.0` is shorthand for `y = y - 1.0` = `10.0 - 1.0` = `9.0`. `y` is never changed anywhere else.

---

**Use the line of java code below to answer questions 4a - 4c:**

```java
float price = 34.3f;
```

**4a. (1pt) What is the variable name?**

- A) `float`
- B) `34.3f`
- *answer* **C) `price`**
- D) `34.3`

> **Rationale:** The variable name is the identifier chosen by the programmer — `price`. `float` is the type, and `34.3f` is the initialization value.

---

**4b. (1pt) What is the variable type?**

- A) `double`
- B) `int`
- C) `price`
- *answer* **D) `float`**

> **Rationale:** `float` is the type — a primitive that stores decimal numbers with less precision than `double`. The `f` suffix on `34.3f` is just syntax that tells Java to treat the literal as a `float` rather than a `double`.

---

**4c. (1pt) What is the initialization value?**

- A) `float`
- B) `price`
- C) `34.3f`
- *answer* **D) `34.3`**

> **Rationale:** The initialization value is the number being stored: `34.3`. The `f` suffix is literal notation that tells Java it's a float, not part of the value itself.

---

**5. (1pt) Which of the following best describes a Java Primitive?**

- *answer* **A) A basic built-in data type that stores a simple value directly in memory**
- B) A more complex data type that stores a reference to data in memory and has methods and properties
- C) A universal character encoding standard that supports characters from all writing systems
- D) Converting a value from one data type to another

> **Rationale:** Java primitives (`int`, `double`, `float`, `boolean`, `char`, etc.) store their value directly in the variable. B describes reference types like `String` or `Scanner`; C describes Unicode; D describes type casting.

---
