## Java Order of Operations - Challenge - Answers

```java
int a = 14;
int b = 2;
boolean c = false;
boolean result = (a / b + 2 >= 7 - 1 || 3 * 4 <= 11) && !(a / b == 7 && a - b != 12) || c;
// Plug in variables
result = (14 / 2 + 2 >= 7 - 1 || 3 * 4 <= 11) && !(14 / 2 == 7 && 14 - 2 != 12) || false;
// Multiplication+Division
result = (7 + 2 >= 7 - 1 || 12 <= 11) && !(7 == 7 && 14 - 2 != 12) || false;
// Addition+Subtraction
result = (9 >= 6 || 12 <= 11) && !(7 == 7 && 12 != 12) || false;
// Comparison: >, <, >=, <=
result = (true || false) && !(7 == 7 && 12 != 12) || false;
// Equality: ==, !=
result = (true || false) && !(true && false) || false;
// Logical AND, &&
result = (true || false) && !(false) || false;
// Parenthesis
result = (true) && !(false) || false;
result = true && !false || false;
// Logical NOT, !
result = true && true || false;
// Logical AND, &&
result = true || false;
// Logical OR, ||
result = true;
```
---
```java
int x = 15;
int y = 4;
boolean z = true;
boolean result = x - 3 * y > 2 && (8 / y + 1 >= 4 || z) && !(x / 3 == 5 && 8 - y < 5) || 6 + 2 != 8;
// Plug in variables
result = 15 - 3 * 4 > 2 && (8 / 4 + 1 >= 4 || true) && !(15 / 3 == 5 && 8 - 4 < 5) || 6 + 2 != 8;
// Multiplication+Division
result = 15 - 12 > 2 && (2 + 1 >= 4 || true) && !(5 == 5 && 8 - 4 < 5) || 6 + 2 != 8;
// Addition+Subtraction
result = 3 > 2 && (3 >= 4 || true) && !(5 == 5 && 4 < 5) || 8 != 8;
// Comparison: >, <, >=, <=
result = true && (false || true) && !(5 == 5 && true) || 8 != 8;
// Equality: ==, !=
result = true && (false || true) && !(true && true) || false;
// Logical AND, &&
result = true && (false || true) && !(true) || false;
// Logical OR, ||
result = true && (true) && !(true) || false;
result = true && true && !true || false;
// Logical NOT, !
result = true && true && false || false;
// Logical AND
result = true && false || false;
result = false || false;
// Logical OR
result = false;

```


