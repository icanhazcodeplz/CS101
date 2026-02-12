## Java Order of Operations

| Priority | Operator(s)          | Description |
|----------|----------------------|------------|
| 1 | `( )`                | Parentheses |
| 2 | `**`                 | Exponentiation |
| 3 | `*`, `/`, `%`        | Multiplication, Division, Modulus |
| 4 | `+`, `−`             | Addition, Subtraction |
| 5 | `>`, `<`, `>=`, `<=` | Relational / Comparison |
| 6 | `==`, `!=`           | Equality |
| 7 | `&&`                 | Logical AND |
| 8 | `\|\|`                | Logical OR |
| 9 | `=`, `+=`, `-=`      | Assignment |

## Java if/else

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
