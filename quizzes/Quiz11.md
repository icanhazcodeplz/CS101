### CS101 Quiz 11
There are 10 points possible. The score will be out of 10.

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. (1pt) What does this code print?**
```java
String a = "Omni-Man";
String b = "omni-man";
System.out.println(a.equals(b));
```
- A) `true`
- B) `Omni-Man`
- C) `omni-man`
- D) `false`

**2. (1pt) What does this code print?**
```java
String a = "Mewtwo";
String b = "mewtwo";
System.out.println(a.equalsIgnoreCase(b));
```
- A) `true`
- B) `false`
- C) `Mewtwo`
- D) `mewtwo`

**3. (1pt) What does this code print?**
```java
String s = "Java is fun";
System.out.println(s.contains("is"));
System.out.println(s.contains("IS"));
```
- A) **`true`** *and* **`true`**
- B) **`false`** *and* **`true`**
- C) **`true`** *and* **`false`**
- D) **`false`** *and* **`false`**

**4. (1pt) What does this code print?**
```java
String s = "Invincible";
System.out.println(s.startsWith("Inv"));
System.out.println(s.endsWith("ble"));
```
- A) **`false`** *and* **`false`**
- B) **`true`** *and* **`true`**
- C) **`true`** *and* **`false`**
- D) **`false`** *and* **`true`**

**5. (1pt) What does this code print?**
```java
String s = "Level Up";
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
```
- A) **`Level Up`** *and* **`Level Up`**
- B) **`level up`** *and* **`LEVEL UP`**
- C) **`LEVEL UP`** *and* **`level up`**
- D) **`Level up`** *and* **`level Up`**

<div style="page-break-before: always;"></div>

**6. (1pt) What does this code print?**
```java
String s = "I love summer";
String result = s.replace("summer", "winter");
System.out.println(result);
System.out.println(s);
```
- A) **`I love winter`** *and* **`I love summer`**
- B) **`I love winter`** *and* **`I love winter`**
- C) **`I love summer`** *and* **`I love winter`**
- D) **`I love summer`** *and* **`I love summer`**

**7. (1pt) What does this code print?**
```java
String data = "math:science:english:history";
String[] classes = data.split(":");
System.out.println(classes[2]);
```
- A) `math`
- B) `science`
- C) `history`
- D) `english`

**8. (1pt) What does this code print?**
```java
String a = "Rosebaum";
String b = new String("Rosebaum");
System.out.println(a == b);
System.out.println(a.equals(b));
```
- A) **`true`** *and* **`true`**
- B) **`false`** *and* **`true`**
- C) **`true`** *and* **`false`**
- D) **`false`** *and* **`false`**

**9. (1pt) What does this code print?**
```java
String s = "Gyarados";
System.out.println(s.startsWith("gyar"));
System.out.println(s.toLowerCase().startsWith("gyar"));
```
- A) **`false`** *and* **`true`**
- B) **`true`** *and* **`true`**
- C) **`true`** *and* **`false`**
- D) **`false`** *and* **`false`**

**10. (1pt) Define "Hard-coded":**

- A) Code that has been compiled into machine language
- B) A program that is difficult to understand or modify
- C) A value written directly into the source code rather than being computed or read from input
- D) A variable that cannot be changed after it is declared
