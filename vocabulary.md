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

## File Systems
- **File System**: Organizational structure to store folders, subfolders, and files.
- **Folder/Directory/Dir**: Holds files and/or other folders
- **Parent Folder**: The folder one level up that contains the current folder.
- **Child Folder/Subfolder/Subdir**: A folder nested inside another folder

## Data Representation
- **ASCII**: A character encoding that represents 128 characters (letters, digits, symbols) using 7 bits
- **Unicode**: A universal character encoding standard that supports characters from all writing systems worldwide, including emojis; extends beyond ASCII's 128 characters with capacity for over 1 million representations (currently only 160,000 in use).
- **RGB**: Red, Green, Blue; a color model where colors are created by combining different intensities of red, green, and blue light (each 0-255)

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

---
#### Not for Quiz4
- **Instantiate**: To create a new object from a class. e.g. `Scanner scanner = new Scanner(System.in);` instantiates a new `Scanner` object.
