# CS101 Quiz 3 - Answers

**Covers**:
- Anything From **Lab3Variables**
- Assignment Operators: See slides **2/3-User-Input**
- Any word on the CS101 Github `vocabulary.md` file

**During Quiz:**
- NO NOTES

---

**Use the code below to answer questions 1 - 3:**

```java
public class quizCode {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 20.0;
        a = 3 + (b - a) / 5.0;

        System.out.println(a);

        a += 1.0;
        a = 1.0;
        b = b + 2.0;
    }
}
```

**1. (2pts) If we run this code, what will be printed to the console?**

- A) `3.0`
- *answer* **B) `6.0`**
- C) `7.0`
- D) `22.0`

> **Rationale:** `a = 3 + (b - a) / 5.0` = `3 + (20.0 - 5.0) / 5.0` = `3 + 15.0 / 5.0` = `3 + 3.0` = `6.0`. Division has higher precedence than addition, so `15.0 / 5.0` is evaluated before adding `3`.

---

**2. (2pts) What is the value of `a` when the program completes?**

- A) `6.0`
- B) `7.0`
- *answer* **C) `1.0`**
- D) `2.0`

> **Rationale:** After the `println`, `a += 1.0` makes `a = 7.0`, but `a = 1.0` immediately overwrites it. The last line to touch `a` wins — its final value is `1.0`.

---

**3. (2pts) What is the value of `b` when the program completes?**

- A) `2.0`
- B) `20.0`
- C) `25.0`
- *answer* **D) `22.0`**

> **Rationale:** `b` starts at `20.0` and is only changed on the last line: `b = b + 2.0` = `20.0 + 2.0` = `22.0`.

---

**Use the line of java code below to answer questions 4a - 4c:**

```java
int month = 2;
```

**4a. (1pt) What is the variable name?**

- A) `int`
- B) `=`
- *answer* **C) `month`**
- D) `2`

> **Rationale:** The variable name is the identifier the programmer chooses — in this case, `month`. `int` is the type, `=` is the assignment operator, and `2` is the value.

---

**4b. (1pt) What is the variable type?**

- A) `month`
- *answer* **B) `int`**
- C) `double`
- D) `2`

> **Rationale:** `int` is the type — it tells Java this variable will hold a whole number. `double` stores decimals, `month` is the variable name, and `2` is the value.

---

**4c. (1pt) What is the initialization value?**

- A) `int`
- B) `month`
- C) `month = 2`
- *answer* **D) `2`**

> **Rationale:** The initialization value is the value assigned when the variable is first declared. Here that is `2`.

---

**5. (1pt) Which of the following best describes **Assignment** in programming?**

- A) Defining a variable's name and type, with or without an initial value
- *answer* **B) Giving a variable a value using the equals sign (`=`)**
- C) The initial value given to a variable when it is first created
- D) Increasing a variable's value, usually by 1

> **Rationale:** Assignment means using `=` to give a variable a value (e.g. `a = 6.0`). A describes declaration, C describes initialization, and D describes incrementing.

---
