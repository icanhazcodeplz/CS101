### Java Order of Operations

| Priority | Operator(s)          | Description |
|----------|----------------------|-----------|
| 1 | `( )`                | Parentheses |
| 2 | `**` , `Math.pow()`  | Exponentiation |
| 3 | `!`                  | Logical NOT |
| 4 | `*`, `/`, `%`        | Multiplication, Division, Modulus |
| 5 | `+`, `−`             | Addition, Subtraction |
| 6 | `>`, `<`, `>=`, `<=` | Relational / Comparison |
| 7 | `==`, `!=`           | Equality |
| 8 | `&&`                 | Logical AND |
| 9 | `                    ||`                | Logical OR |
| 10 | `=`, `+=`, `-=`      | Assignment |

---

### Java Control Flow

<table>
<tr>
<td>

### if
```java
if (condition) {
    // code block
}
```

### if/else
```java
if (condition) {
    // code block
} else {
    // code block
}
```

### Ternary if/else
```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

</td>
<td>

### if/else-if
```java
if (condition1) {
    // code block
} else if (condition2) {
    // code block
} else {
    // code block
}
```

### Switch
```java
switch(expression) {
    case x:
        // code block
        break;
    case y:
        // code block
        break;
    default:
        // code block
}
```

</td>
</tr>
</table>

<table>
<tr>
<td>

### for loop
```java
for (int i = 0; i < 5; i++) {
    // code block
}
```

</td>
<td>

### while loop
```java
while (condition) {
    // code block
}
```

</td>
<td>

### do-while loop
```java
do {
    // code block
} while (condition);
```

</td>
</tr>
</table>

### Java Methods

```java
public static <returnType> <methodName>(<parameters>) {
    // code that runs when the method is called
    return <someValue> // Note: Don't need 'return' if <returnType> is `void`
}
```


### Java Arrays

<table>
<tr>
<td>

### Create with values
```java
int[] numbers = {10, 20, 30, 40, 50};
String[] colors = {"red", "green", "blue"};
```

</td>
<td>

### Create empty (fixed size)
```java
int[] numbers = new int[5];
```

</td>
</tr>
<tr>
<td>

### Access / Modify
```java
numbers[0]       // first element
numbers[2] = 99; // change third element
numbers.length   // number of elements
```

</td>
<td>

### for-each loop
```java
for (int num : numbers) {
    // code block
}
```

</td>
</tr>
</table>
