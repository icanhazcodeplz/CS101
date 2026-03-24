# CS101
Course Content and Resources for CS101, sponsored by [Heights Philadelphia](https://heights.org/), taught through [Arcadia University](https://www.arcadia.edu/).
### [Arcadia Course Canvas Link](https://canvas.arcadia.edu/courses/46565)
___



## Topic 12: ArrayList, File Scanner
#### Associated Lab: [lab13FileScannerArrayList](TODO)
 - [w3 Java ArrayList](https://www.w3schools.com/java/java_arraylist.asp)
 - [w3 Java Files](https://www.w3schools.com/java/java_files_read.asp)
 - [ArrayList in Java Tutorial #36](https://youtu.be/pTAda7qU4LY?si=Csr94zQXCNBkP4M4)

> An **ArrayList** is like an array, but it can grow and shrink in size.
>
> ```java
>  import java.util.ArrayList;
>  ArrayList<String> names = new ArrayList<String>();
> ```
> Note: ArrayLists use object types (`String`, `Integer`, `Double`), not primitives (`int`, `double`).
>
> Common methods:
> ```java
>  names.add("Alice");       // add to the end
>  names.get(0);             // access by index
>  names.set(0, "Bob");      // change an element
>  names.remove("Alice");    // remove by value
>  names.size();             // number of elements
>  names.contains("Bob");    // check if element exists
> ```
>
> A **Scanner** can read from a file just like it reads from `System.in`:
> ```java
>  import java.io.File;
>  File file = new File("data.txt");
>  Scanner fileScanner = new Scanner(file);
>  while (fileScanner.hasNextLine()) {
>     String line = fileScanner.nextLine();
>  }
>  fileScanner.close();
> ```

___
## Topic 11: Arrays
#### Associated Labs: [lab11Arrays](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab11_arrays/lab11Arrays.java) and [lab12Arrays2d](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab12_arrays2d/lab12Arrays2d.java)
 - [w3 Java Arrays](https://www.w3schools.com/java/java_arrays.asp)
 - [w3 Java Arrays Loop](https://www.w3schools.com/java/java_arrays_loop.asp)
 - [w3 Java Multidimensional Arrays](https://www.w3schools.com/java/java_arrays_multi.asp)
 - [Learn Java arrays in 9 minutes!](https://youtu.be/9dr2mHYYoug?si=_4GaVz69puYrpvZS)
 - [Learn Java 2D arrays in 9 minutes!](https://youtu.be/Qf3Nczxm2AY?si=wiPl-Nzcxd1yNArt)

> An **array** is a variable that holds multiple values of the same type.
>
> To create an array with values already known:
> ```java
>  int[] numbers = {10, 20, 30, 40, 50};
> ```
> To create an empty array of a specific size:
> ```java
>  int[] numbers = new int[5];
> ```
> Access or modify elements using their **index** (starting at 0):
> ```java
>  System.out.println(numbers[0]); // prints the first element
>  numbers[1] = 99;                // changes the second element
> ```
> Use a **for-each loop** to iterate over elements:
> ```java
>  for (int num : numbers) {
>     System.out.println(num);
>  }
> ```
>
> ### Multidimensional Arrays
>
> A **multidimensional array** is an array of arrays — it lets you store data in a grid (rows and columns).
>
> To create a 2D array:
> ```java
>  int[][] grid = {
>     {1, 2, 3},
>     {4, 5, 6},
>     {7, 8, 9}
>  };
> ```
> To create an empty 2D array (3 rows, 4 columns):
> ```java
>  int[][] grid = new int[3][4];
> ```
> Access elements using **two indices** — `[row][column]`:
> ```java
>  System.out.println(grid[0][2]); // row 0, column 2 → prints 3
>  grid[1][0] = 99;               // changes row 1, column 0
> ```


___
## Topic 10: Methods
#### Associated Lab: [lab10Methods](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab10_methods/lab10Methods.java)
 - [w3 Java Methods](https://www.w3schools.com/java/java_methods.asp)
 - [w3 Java Parameters](https://www.w3schools.com/java/java_methods_param.asp)
 - [Methods in Java Tutorial #26](https://youtu.be/cCgOESMQe44?si=HryUGHDdBNI4Uu2x)
 - [METHODS in Java are easy](https://youtu.be/JKecvKiNX2I?si=U-W9Zp22eVVyQdaH)

> Methods are a named, reusable block of code that performs a specific task.
> 
> Java methods use the syntax:
> ```java
>  public static <returnType> <methodName>(<parameters>) {
>    // code that runs when the method is called
>  }
> ```
> - `returnType` is the data type the method sends back (e.g. `int`, `String`, `boolean`). Use `void` if the method returns nothing.
> - `parameters` are inputs the method receives, each with a type and name, separated by commas. A method does not need to have `parameters`.
>
> For example, a method named "***add***" that that takes two integers, `a` and `b`, as parameters and returns their sum as an `int`:
> ```java
>  public static int add(int a, int b) {
>     return a + b;
>  }
> ```
> You ***call*** a method by placing parenthesis to the right of the method. Inside the parenthesis, add comma separated ***arguments*** matching the type(s) of the method's ***parameters***. 
> ```java
>  int result = add(3, 5); // Passing in the arguments 3 and 5
> ```
> In this example, the ***return value*** from the method is assigned to `result` 

___
## Topic 9: Scope
 - [w3 Java Scope](https://www.w3schools.com/java/java_scope.asp)

---
## Topic 8: While Loops
#### Associated Lab: [Lab8: While Loops](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab8_while_loops/lab8WhileLoops.java)

  - [w3 Java While Loops](https://www.w3schools.com/java/java_while_loop.asp)
  - [w3 Java Do-While Loops](https://www.w3schools.com/java/java_while_loop_do.asp)
  - [#17 While Loop in Java Telusko](https://youtu.be/mzt5tmV7wxI?si=_JqtFgpzRdU0AJfr)
  - [#18 Do While Loop in Java](https://youtu.be/zzBVTwpfYr0?si=U-xfgZpgUK_4luV_)
  

> Java while loops use the syntax:
> ```java
>  while (<condition>) {
>    // code runs repeatedly as long as <condition> is true
>  }
> ```
> - The `condition` is checked before each iteration. If it is `true`, the block of code will run once and then check `condition` again, continuing to run as long as `condition` is `true`. If `condition` is `false` from the start, the loop body never runs.
>
> For example, to print the numbers from 1 to 5:
> ```java
>  int i = 1;
>  while (i <= 5) {
>     System.out.println(i);
>     i++;
>  }
> ```
>
> A **do-while** loop runs the body at least once, then checks the condition:
> ```java
>  do {
>    // code runs at least once
>  } while (<condition>);
> ```
___

## Topic 7: For Loops
#### Associated Lab: [Lab7: For Loops](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab7_for_loops/lab7_for_loops_writeup.md)

  - [w3 Java For Loops](https://www.w3schools.com/java/java_for_loop.asp)
  - [w3 Java Nested For-Loops](https://www.w3schools.com/java/java_for_loop_nested.asp)
  - [Java for loops are easy!](https://youtu.be/vOmZ4JFhRds?si=Y8b9D8jETp0wWN7l)
  - [Learn Java nested loops in 8 minutes!](https://youtu.be/sd4x2QG2K6U?si=qwGZ3UMlwxyd6fyw)

> Java for-loops use the syntax:
> ```java
>  for (<start>; <stop>; <how>) {
>    // code is run from <start> to <stop>, incrementing by <how>
>  }
> ```
> - For the `start`, initialize a variable to some integer
> - For the `stop`, create a condition which defines when the for loop stops running
> - For the `how`, define how the variable that you initialized in the `start` is going to be updated each loop
> 
> For example, to print the numbers from 3 to 12, incrementing by 3 each time, you could use:
> ```java
>  for (int n = 3; n <= 12; n+=3) {
>     System.out.println(n);
>  }
> ```
___

## Topic 6: Compiled vs Interpreted
#### Associated Lab: [Lab6-Compiled-Interpreted-Handout](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab6_compiled_interpreted/Lab6-Compiled-Interpreted-Handout.pdf)

- **Videos**
  - [Interpreter vs Compiler: What's the Difference?](https://youtu.be/ZWM-I2rRfP8?si=fSMLlX2gHPVWzd74)
  - [Compiler and Interpreter: Compiled Language vs Interpreted Programming Languages](https://youtu.be/I1f45REi3k4?si=hKfAo1IPHYkKiOVA)
  - [Python Vs C++ Vs Java!](https://www.youtube.com/watch?v=hnlz0YYCpBU)

- **Extra**
  - [How do computers read code?](https://youtu.be/QXjU9qTsYCc?si=vuXLSX7ymRiKba-W)
___

## Topic 5: Booleans, Conditionals
#### Associated Lab: [lab5_booleans_conditionals](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab5_booleans_conditionals/lab5_booleans_conditionals_writeup.md)

- **START WITH**: [#15 Boolean Java Tutorial](https://youtu.be/CHVVEGRGiJU?si=tV1tpSfP7ium-Ip1)

- **w3 Pages**
  - [w3 Java Comparison Operators](https://www.w3schools.com/java/java_operators_comparison.asp)
  - [w3 Java Logical Operators](https://www.w3schools.com/java/java_operators_logical.asp)
  - [w3 If...Else](https://www.w3schools.com/java/java_conditions.asp) --> Go through all of these EXCEPT the "Short Hand If...Else", this will be covered later.
- **tutorials** (intentionally out of order)
  - [#16 How To Use Comparison Operators In Java](https://youtu.be/jRdPsDjW8DY?si=il0JghpVUHOIP_dp)
  - [#20 Logical Operators In Java](https://youtu.be/p0UCTkqU2mg?si=hnrHGEhfsHYzujCr)
  - [#17 If Else Statement In Java Tutorial](https://youtu.be/yvWnj_HfG6s?si=cW1iRhV6-qAUZx5R)
___

## Topic 4: User CLI Input and Type Casting/Conversion/Parsing
#### Associated Lab: [lab4_input_and_casting](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab4_input_and_casting/lab4_input_and_casting_writeup.md)

- **User Input**
    - [#14 Java Scanner Tutorial](https://youtu.be/Wgkb0zg7WOM?si=sTBGxy-MerOSvjQo)
      - If still confused, try:
        - [#12 How to get String Input from a User in Java](https://youtu.be/jK6NX9iyi-8?si=H2ZrQ7bcJbNC3sW9)
        - [#13 Java Program Example: Add Two Numbers From a User](https://youtu.be/dVTgNsv3pX4?si=pvsVVGRH7u_rZ2qv)
- **Type Casting**
    - [#55 Java Type Casting Tutorial](https://youtu.be/H0LNjF9PSeM?si=ZhGgnWbZEsmbx75F) 
    - [w3 Java Type Casting](https://www.w3schools.com/java/java_type_casting.asp)
- **parseInt** 
    - [How to Convert String to Int in Java](https://youtu.be/nRuLhGdkS4Q?si=ocGdiHnH2EgARBYu)
    - [#56 parseInt Java Tutorial - String to Integer](https://youtu.be/Pnaqn6GOyzU?si=40BG16qqeVtoB2W0)
___

## Topic 3: Java Variables & Arithmetic
#### Associated Lab: [lab3_variables](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab3_variables/lab3_variables_writeup.md)

- **Variables**
    - [#6 Java Strings Tutorial](https://youtu.be/3xuJIaP3C4g?si=evoB0sKIBjzqOKpd)
    - [#7 Java Int Variables](https://youtu.be/3Bf2Y9NBcck?si=iFF2FxF11KmXusio)
    - [#9 Double, Long and Float Java Tutorial](https://youtu.be/qawwQf6gKpQ?si=4hAjAfFLjTJ8ya97)
    - [Codecademy: Intro to Java, Variables](https://www.codecademy.com/courses/java-introduction/lessons/learn-java-variables/exercises/introduction) (free)
- **Arithmetic** 
    - [Java arithmetic is easy!](https://www.youtube.com/watch?v=QAD5unRlCyo)
    - [w3 Java Arithmetic Operators](https://www.w3schools.com/java/java_operators_arithmetic.asp)
___

## Topic 2: Java Print Statements
#### Associated Lab: [lab2_java_print_statements](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab2_java_print_statements/lab2_java_print_statements_writeup.md)
 - **Tutorials**
     - [#2 System.out.println In Java](https://youtu.be/xGAGDp-6IU4?si=7yJSqyq-U9MYm0Kt)
     - [#3 Comments in Java](https://youtu.be/yxIAXB1wk7w?si=wUcs1t4UYI6wcGsE)
     - [#4 Escape Sequences In Java](https://youtu.be/LsvVdx2IE4c?si=R1Y9Mb0iu7Ii0tEn)
     - (project) [#5 Animated ASCII Art Java Code](https://youtu.be/zEIsf-QhHxQ?si=U-jNA7gL68tIqOov)
   - [Codecademy: Intro to Java, HelloWorld](https://www.codecademy.com/courses/java-introduction/lessons/hello-world-java/exercises/introduction-to-java) (free)
> The basic boilerplate for a java class is:
> ```java
> public class helloWorld {
>     public static void main(String[] args) {
>        System.out.println("Hello, World!");
>    }
> }
> ```
> The name of the file must match the name of the class. In this case it must be `helloWorld.java`.
___

## Topic 1: Command Line (CLI)
#### Associated Lab: [lab1_shell_script](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab1_shell_script/lab1_shell_script_writeup.md)
 - **Tutorials**
   - **Codecademy**:
     - [Codecademy: Intro to the Command Line](https://www.codecademy.com/learn/intro-to-the-command-line) (free)
     - [Codecademy: Learn the Command Line: Viewing and Changing the File System](https://www.codecademy.com/learn/learn-the-command-line-viewing-and-changing-the-file-system) (free)
   - [SW Carpentry](https://swcarpentry.github.io/shell-novice/index.html)
   - [Ubuntu Tutorial](https://ubuntu.com/tutorials/command-line-for-beginners#1-overview)
   - [Command Line Crash Course For Beginners](https://www.youtube.com/watch?v=uwAqEzhyjtw) (44min)
Reference Cheatsheets (list of commands):  [One Pager](https://www.git-tower.com/blog/media/pages/posts/command-line-cheat-sheet/64337e6bae-1765195492/command-line-cheat-sheet-large01.avif) and/or [One With Descriptions](https://gist.github.com/bradtraversy/cc180de0edee05075a6139e42d5f28ce)
> #### Tips:
>  - Be ***very careful*** with the `rm` command. There is no way to undo! It is easy to accidently delete important files forever.
>  - If you get stuck in a weird interface, try:
>      - Hit `Enter` a few times 
>      - Hit `CTRL` - `c` or `CTRL` - `d`
>      - Hit `q`
>      - (last resort) Close window and start over
___

## Other Resources

### Touch Typing
 - [typing.com](https://www.typing.com/) : Used for typing tests to calculate extra credit points
 - [KeyBr](https://www.keybr.com/) : Typing practice
 - [TypingClub](https://www.typingclub.com/) : Typing exercises

### Integrated Development Environments (IDEs) for Java
- [VS Code with Java Extensions](https://code.visualstudio.com/docs/languages/java) - Free lightweight editor with plugins for (almost) everything
- [Harvard CS50 Codespaces](https://cs50.dev/) - Online version of VS Code accessible via browser (connects to remote machine)
  - Purposefully does NOT have tab-completion
  - Includes CS50s Duck Debugger, a free ChatGPT powered AI that will guide your learning, but will not write code for you.
- [Intellij IDEA](https://www.jetbrains.com/idea/) - Professional level IDE; No additional setup required for Java development
  - Requires significant RAM and may be too slow on old machines
- [Eclipse IDE](https://eclipseide.org/) - Similar to Intellij, with slightly smaller RAM footprint and older-looking interface

## Windows Intellij IDEA Setup
 - [Java 25](https://www.oracle.com/java/technologies/downloads/#jdk25-windows)
 - [Git Bash](https://git-scm.com/install/windows)
 - [IDEA](https://www.jetbrains.com/idea/download/?section=windows)

### Windows Tips for Reducing Memory load

 - Uninstall ubuntu
   - Use windows key, search "Ubuntu", select "Uninstall"
   - Open the app `Powershell` as an Administrator
   - Run commands
     - `wsl --unregister Ubuntu`
     - `wsl --uninstall`
 - Uninstall the follow apps
   - `Microsoft 365 Copilot`



