### Oral Quiz 1 — For-Each Loop & Conditionals

```java
public class oral1 {
    public static void main(String[] args) {
        int[] scores = {55, 90, 60};

        int total = 0;
        for (int s : scores) {
            total += s;
        }

        int average = total / scores.length;
        System.out.println("Average: " + average);

        if (average >= 60) {
            System.out.println("Passing");
        } else {
            System.out.println("Not passing");
        }
    }
}
```

<div style="page-break-after: always;"></div>



### Oral Quiz 2 — Variables & String Concatenation

```java
public class oral2 {
    public static void main(String[] args) {
        String name = "Alex";
        int age = 16;
        int yearsUntilAdult = 18 - age;

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        if (yearsUntilAdult > 0) {
            System.out.println(yearsUntilAdult + " years until you're an adult.");
        } else {
            System.out.println("You are already an adult.");
        }
    }
}
```

<div style="page-break-after: always;"></div>

---

### Oral Quiz 3 — Scanner & Conditionals

```java
import java.util.Scanner;

public class oral3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        if (num > 0) {
            System.out.println("It's positive.");
        } else if (num < 0) {
            System.out.println("It's negative.");
        } else {
            System.out.println("It's zero.");
        }
    }
}
```

**If the user enters `4`, what is the output?**

<div style="page-break-after: always;"></div>



### Oral Quiz 4 — ArrayList

```java
import java.util.ArrayList;

public class oral4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names.size());
        System.out.println(names.get(1));

        names.set(0, "Ana");
        names.add("Dana");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

<div style="page-break-after: always;"></div>



### Oral Quiz 5 — Arrays & For Loop

```java
public class oral5 {
    public static void main(String[] args) {
        String[] pets = {"cat", "dog", "fish", "bird"};

        for (int i = 0; i < pets.length; i++) {
            System.out.println("I love my " + pets[i] + " !");
        }

        System.out.println("I have " + pets.length + " pets");
    }
}
```

<div style="page-break-after: always;"></div>



### Oral Quiz 6 — Methods

```java
public class oral6 {
    public static void main(String[] args) {
        int result = addAndDouble(3, 5);
        System.out.println("Result: " + result);

        greet("Sam");
        greet("Jordan");
    }

    public static int addAndDouble(int a, int b) {
        return (a + b) * 2;
    }

    public static void greet(String name) {
        System.out.println("Hi, " + name + "!");
    }
}
```

<div style="page-break-after: always;"></div>



### Oral Quiz 7 — String Methods

```java
public class oral7 {
    public static void main(String[] args) {
        String phrase = "Hello, World!";

        System.out.println(phrase.length());

        System.out.println(phrase.toLowerCase().startsWith("hello"));

        if (phrase.contains("world")) {
            System.out.println("The phrase has world");
        }

        System.out.println(phrase.replace("World", "Java"));
    }
}
```

<div style="page-break-after: always;"></div>



### Oral Quiz 8 — String split()

```java
public class oral8 {
    public static void main(String[] args) {
        String line = "apple,banana,cherry";
        String[] fruits = line.split(",");
        System.out.println("There are " + fruits.length + " fruits:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
```
