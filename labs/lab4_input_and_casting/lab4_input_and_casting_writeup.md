# CS101 Lab4: User Input and Type Casting

## Learning Objectives
In this exercise you will use Java to practice:
- Importing and using the `Scanner` class
- Reading String input from the user
- Reading int input from the user
- Reading double input from the user
- Casting between numeric types (`int` to `double`, `double` to `int`)
- Understanding when and why casting is needed

---

## Instructions
1. Create a new file in your workspace directory of your Codespaces IDE called `lab4InputAndCasting.java`
2. Copy the contents of the [lab4InputAndCasting.java](https://github.com/icanhazcodeplz/CS101/blob/main/labs/lab4_input_and_casting/lab4InputAndCasting.java) (click on link)
3. Paste the contents into your new `lab4InputAndCasting.java` file in Codespaces
4. Add lines of code below each question, testing your code along the way.
5. When complete, upload the file and submit on Canvas. You must get ALL steps correct to get credit (no partial credit).

---

## Example Output
When I run my code this is printed to the console (user input shown in **bold**). Note that for grading I will be checking that the code itself is correct, not the output.
```bash
CS101 - Lab4: User Input and Type Casting

--- String Input ---
What is your name? **Alice**
Hello, Alice!

--- Integer Input ---
How old are you? **20**
Next year you will be 21

Enter a number: **7**
Enter another number: **3**
7 / 3 = 2 (integer division)

--- Double Input ---
Enter a decimal number: **3.14**
You entered: 3.14

--- Type Casting ---
intValue: 42
intValue as double: 42.0
doubleValue: 9.99
doubleValue as int: 9
The decimal part was truncated!

--- Practical Casting Example ---
You have 10 candies and 3 friends.
Integer division: 10 / 3 = 3
Double division: 10 / 3 = 3.3333333333333335
```