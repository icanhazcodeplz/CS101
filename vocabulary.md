# Vocabulary

## Hardware
- **Hardware**: Physical components of a computer (keyboard, monitor, motherboard, etc.)
- **Hard Drive**: Storage device using spinning magnetic disks to store data permanently
- **Solid State Drive (SSD)**: Storage device using flash memory chips; faster and more durable than hard drives
- **Motherboard**: Main circuit board that connects all computer components together
- **Central Processing Unit (CPU)**: The "brain" of the computer that executes instructions and performs calculations
- **Clock Speed**: How fast a CPU executes instructions, measured in GHz (billions of cycles per second)
- **CPU Cores**: Independent processing units within a CPU; more cores allow more tasks to run simultaneously
- **Random Access Memory (RAM)**: Fast, temporary memory that stores data for running programs; cleared when powered off
- **Graphics Processing Unit (GPU)**: Specialized processor for rendering graphics and parallel computations
- **I/O**: Common shorthand for "Input/Output".
    - **input**: Data or instructions entered into a computer (keyboard, mouse, files).
    - **output**: Results produced by a computer (display, printed documents, files).
- **Parallel vs Serial**: Serial processes tasks one at a time in sequence; parallel processes multiple tasks simultaneously

## Software & Operating Systems
- **Software**: Programs and instructions that tell hardware what to do
- **Operating System (OS)**: Base software of a computer that manages hardware and software resources, acting as a bridge between user and physical machine.
- **Application**: Software designed for end-users to perform specific tasks, like browsing the web, writing documents, or playing games.
- **Kernel**: Core part of the OS that directly manages hardware, memory, and processes
- **Shell**: Interface for users to interact with the OS, either via command line (terminal) or graphical (GUI)
- **Terminal**: Text-based interface for typing commands directly to the shell (also called command line or console)
- **Graphical User Interface (GUI)**: Visual interface with windows, icons, and menus that users interact with using a mouse/touch
- **Integrated Development Environment (IDE)**: A software application that provides tools for writing, testing, and debugging code all in one place. Examples include VS Code, IntelliJ, and Eclipse.
- **Debugger**: A tool that lets you pause a running program, step through it line by line, and inspect variable values to find and fix bugs. Most IDEs have a built-in debugger.

## File Systems
- **File System**: Organizational structure to store folders, subfolders, and files.
- **Folder/Directory/Dir**: Holds files and/or other folders
- **Parent Folder**: The folder one level up that contains the current folder.
- **Child Folder/Subfolder/Subdir**: A folder nested inside another folder

## Data Representation
- **ASCII**: A character encoding that represents 128 characters (letters, digits, symbols) using 7 bits
- **Unicode**: A universal character encoding standard that supports characters from all writing systems worldwide, including emojis; extends beyond ASCII's 128 characters with capacity for over 1 million representations (currently only 160,000 in use).
- **RGB**: Red, Green, Blue; a color model where colors are created by combining different intensities of red, green, and blue light (each 0-255)
- **CSV**: Comma-Separated Values; a plain-text file format where each line is a row and fields within a row are separated by commas. e.g. `name,age,city\nAlice,30,Denver`. 

## Variables & Operations
- **Declaration**: Defining a variable's name and type, with or without an initial assignment. e.g. `int x;` or `int x = 5;`
- **Assignment**: Giving a variable a value, using the assignment operator, the equals sign ("="). e.g. `x = 5;`
- **Initialization**: The initial assignment of a variable.
- **Increment**: To increase, usually by 1. e.g. `x = x + 1;` or `x+=1;`
- **Decrement**: To decrease, usually by 1. e.g. `x = x - 1;` or `x-=1;`
- **Concatenation**: Joining two or more strings together using the `+` operator. e.g. `"Hello, " + name` produces `"Hello, Alice"` if `name` is `"Alice"`.

## Data Types & Type Conversion
- **Java Primitive**: A basic built-in data type that stores a simple value directly in memory. The 8 primitives are: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, and `char`.
- **Java Object**: A more complex data type that stores a reference to data in memory. Objects have methods and properties. Examples: `String`, `Scanner`, `ArrayList`.
- **Type Casting**: Converting a value from one data type to another. e.g. `(double) 5` converts the int `5` to `5.0`.
- **Widening**: In Java, automatically converting a smaller data type to a larger one with no data loss. e.g. `int` to `double`: `double d = 5;` results in `5.0`.
- **Narrowing**: In Java, manually converting a larger data type to a smaller one, which may lose data. Requires explicit casting. e.g. `double` to `int`: `int x = (int) 9.99;` results in `9` (decimal truncated).
- **Parsing**: Analyzing a string and converting it and/or splitting into usable components. e.g. the java compiler parsing `int x = 5` into `type -> int`, `name -> x`, and `value -> 5` , or `Integer.parseInt("123")` parsing the String `"123"` into the int `123`.

## Classes and Objects
- **Instantiate**: To create a new object from a class. e.g. `Scanner scanner = new Scanner(System.in);` instantiates a new `Scanner` object.

## Programming Concepts
- **Pseudocode**: An informal, human-readable description of a program's logic that uses plain language and simple structure rather than actual programming syntax. Used to plan out algorithms before writing real code.
- **Statically Typed**: A language where variable types are known at compile time. Once a variable is declared with a type, it cannot hold a value of a different type. Java and C are statically typed — e.g. `int x = 5;` means `x` can only ever hold an `int`.
- **Dynamically Typed**: A language where variable types are determined at runtime rather than compile time. A variable can hold different types of values throughout its lifetime. Python, JavaScript, and Ruby are dynamically typed — e.g. in Python, `x = 5` then `x = "hello"` is perfectly valid.
- **Hard-coded**: A value written directly into the source code rather than being computed, passed in, or read from input. e.g. `int max = 100;` hard-codes the maximum to `100` instead of letting the user provide it.
- **Scope**: The region of code where a variable exists and can be accessed. A variable declared inside a block (between `{ }`) is only accessible within that block. e.g. a variable declared inside a `for` loop cannot be used outside of it.
- **Case-Sensitive**: Treating uppercase and lowercase letters as different characters. e.g. in programming, `myVar` and `myvar` are two distinct variable names.

## Compiled and Interpreted
- **Compiler**: Program that translates the entire code base into machine code or bytecode.
- **Interpreter**: Program that reads and executes source code one line at a time during runtime.
- **Source Code**: Human-readable code written by a programmer.
- **Machine Code**: Low-level binary instructions (1s and 0s) that a CPU can execute directly. Platform dependent. 
- **Bytecode**: Intermediate, platform-independent code that is not quite machine code and not quite source code. Java compiles to bytecode (`.class` files) which runs on the JVM.
- **Java Virtual Machine (JVM)**: A virtual machine that executes Java bytecode, allowing Java programs to run on any platform with a JVM installed ("write once, run anywhere").

## History of Computing
- **Step Reckoner**: A mechanical calculator. The first machine capable of addition, subtraction, multiplication, and division.
- **Ada Lovelace**: English mathematician who wrote hypothetical programs for the Analytical Engine; often considered the world's first programmer.
- **Relay**: An electrically-controlled mechanical switch. Could switch on/off about 50 times per second in the 1940s.
- **Vacuum Tube**: Electronic component that controls electric current flow inside a glass bulb. No moving parts. Could switch thousands of times per second. Used in computers from the 1940s-1950s.
- **Semiconductor**: A material that can sometimes conduct electricity and sometimes resist it. Used as the basis for transistors. The most common semiconductor material is silicon.
- **Transistor**: Electronic switch made of semiconductor material, invented in 1947 at Bell Labs. Smaller and faster than vacuum tubes. Can switch on/off millions of times per second.
- **ENIAC**: The world's first general purpose, programmable, electronic computer. Completed in 1946 at the University of Pennsylvania. Used vacuum tubes.

## Methods
- **Method**: A named, reusable block of code that performs a specific task. Defined with a return type, name, and optional parameters. e.g. `public static int add(int a, int b) { return a + b; }`
- **Parameter**: A variable listed in a method's definition that acts as a placeholder for the value the method will receive. e.g. in `public static void greet(String name)`, `name` is a parameter.
- **Argument**: The actual value passed to a method when it is called. e.g. in `greet("Alice")`, `"Alice"` is the argument.
- **Return Type**: The data type of the value a method sends back to the caller. e.g. `int` in `public static int add(int a, int b)`. If a method returns nothing, its return type is `void`.
- **Return Value**: The actual value that a method sends back to the caller using a `return` statement. e.g. in `return a + b;`, if `a` is 3 and `b` is 5, the return value is `8`.
- **Method Call**: Executing a method by writing its name followed by parentheses with any required arguments. e.g. `add(3, 5)` calls the `add` method with arguments `3` and `5`. Often phrased as "calling a method".

## Arrays
- **Array**: A fixed-size data structure that holds multiple values of the same type. e.g. `int[] numbers = {10, 20, 30};` creates an array of three integers.
- **Index**: The position of an element in an array, starting at 0. e.g. in `{10, 20, 30}`, index 0 is `10`, index 1 is `20`, index 2 is `30`.
- **Element**: A single value stored at a specific index in an array. e.g. in `int[] nums = {10, 20, 30};`, `20` is the element at index 1.
- **ArrayList**: A resizable collection of objects that can grow and shrink as elements are added or removed.

