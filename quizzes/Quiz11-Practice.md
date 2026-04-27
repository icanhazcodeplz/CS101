### CS101 Quiz 11 - Practice

#### Name \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**1. What does this code print?**
```java
String a = "Pikachu";
String b = "pikachu";
System.out.println(a.equals(b));
```
- A) `true`
- B) `false`
- C) `Pikachu`
- D) Compile error

**2. What does this code print?**
```java
String a = "Eevee";
String b = "eevee";
System.out.println(a.equalsIgnoreCase(b));
```
- A) `true`
- B) `false`
- C) `Eevee`
- D) Compile error

**3. What does this code print?**
```java
String s = "The quick brown fox";
System.out.println(s.contains("quick"));
System.out.println(s.contains("Quick"));
```
- A) `true` and `true`
- B) `true` and `false`
- C) `false` and `true`
- D) `false` and `false`

**4. What does this code print?**
```java
String s = "";
String t = "Squirtle";
System.out.println(s.isEmpty());
System.out.println(t.isEmpty());
```
- A) `true` and `false`
- B) `false` and `true`
- C) `true` and `true`
- D) Compile error

**5. What does this code print?**
```java
String s = "Charmander";
System.out.println(s.startsWith("Char"));
System.out.println(s.endsWith("der"));
```
- A) `true` and `true`
- B) `true` and `false`
- C) `false` and `true`
- D) `false` and `false`

<div style="page-break-before: always;"></div>

**6. What does this code print?**
```java
String s = "Game Over";
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
```
- A) `Game Over` and `Game Over`
- B) `game over` and `GAME OVER`
- C) `GAME OVER` and `game over`
- D) Compile error

**7. What does this code print?**
```java
String s = "I like cats";
String result = s.replace("cats", "dogs");
System.out.println(result);
System.out.println(s);
```
- A) `I like dogs` and `I like dogs`
- B) `I like dogs` and `I like cats`
- C) `I like cats` and `I like dogs`
- D) Compile error

**8. What does this code print?**
```java
String data = "10,20,30,40";
String[] parts = data.split(",");
System.out.println(parts[2]);
System.out.println(parts.length);
```
- A) `20` and `4`
- B) `10` and `4`
- C) `30` and `4`
- D) Compile error

**9. What does this code print?**
```java
String a = "Jigglypuff";
String b = new String("Jigglypuff");
System.out.println(a == b);
System.out.println(a.equals(b));
```
- A) `true` and `true`
- B) `false` and `true`
- C) `true` and `false`
- D) `false` and `false`

**10. What does this code print?**
```java
String s = "Bulbasaur";
System.out.println(s.startsWith("bulb"));
System.out.println(s.toLowerCase().startsWith("bulb"));
```
- A) `true` and `true`
- B) `true` and `false`
- C) `false` and `false`
- D) `false` and `true`

**11. Define "Narrowing":**

- A) Automatically converting a smaller data type to a larger one with no data loss
- B) Manually converting a larger data type to a smaller one, which may lose data
- C) Removing whitespace from the beginning and end of a String
- D) Splitting a String into an array of smaller Strings
