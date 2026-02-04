# Homework 2: Tip Calculator

## Objective
Create a Java program that calculates the tip and total bill for a restaurant meal.

## Java Concepts Covered
- Variables 
- Arithmetic
- User CLI Input 
- Type Casting/Conversion/Parsing

---

## Requirements

### 1. User Input
**Use `Scanner` to prompt the user for:**
1. The bill amount
2.  The tip percentage they want to leave (e.g., 15, 18, 20)
3.  The number of people splitting the bill

### 2. Arithmetic
**Calculate:**
- Tip amount = bill × (tipPercent / 100)
- Total bill = bill + tip
- Per-person amount = total / numberOfPeople

### 3. Print Result
Print the results. At a minimum, include:
1. Initial bill (before tip)
2. Tip Percentage and Tip amount
3. Total bill
4. Amount each person pays

For example, the output may look like:
```
Bill: $85.50
Tip (18%): $15.39
Total: $100.89
Each person pays: $33.63
```

Format all of these to print two decimal places. Here's an example of how to do so:
```java
double total = 23.4373;
String total2decimals = String.format("%.2f", total); // Rounds to 2 decimal places and converts to a string
System.out.println(total2decimals); // Prints 23.44 to console 
```


---

## Example Output
You do not need to use these exacts words, but here is an example of what someone using the program might look like:
```
Enter the bill amount: 85.50
Enter tip percentage (e.g., 15, 20): 18
How many people are splitting the bill? 3

--- Results ---
Bill: $85.50
Tip (18%): $15.39
Total: $100.89
Each person pays: $33.63
```

---

## Grading

 - 10pts: Code compiles without error
 - 2pts: Program asks for and accepts the bill amount
 - 2pts: Program asks for and accepts the tip percentage
 - 2pts: Program asks for and accepts the number of people splitting the bill
 - 2pts: Program prints the initial bill amount with correct format, e.g. `$85.50`. Note two decimal places.
 - 2pts: Program prints the tip percentage with correct format, e.g. `18%`. Note percentage `%` is printed to screen.
 - 2pts: Program prints the tip amount with correct format, e.g. `$15.39`. Note two decimal places.
 - 2pts: Program prints the total bill with correct format, e.g. `$100.89`. Note two decimal places.
 - 2pts: Program prints the amount each person pays with correct format, e.g. `$33.63`. Note two decimal places.
 - 15pts: One point awarded for each correct output value (must be exact) for the following test cases:

<table>
  <thead>
    <tr>
      <th></th>
      <th></th>
      <th>Basic</th>
      <th>Add people</th>
      <th>Bill as integer</th>
      <th>Tip as float</th>
      <th>Zero tip</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="3"><strong>Input</strong></td>
      <td>Bill</td>
      <td>10.10</td>
      <td>10.10</td>
      <td>45</td>
      <td>120.4</td>
      <td>25.00</td>
    </tr>
    <tr>
      <td>Tip %</td>
      <td>10</td>
      <td>10</td>
      <td>25</td>
      <td>15.7</td>
      <td>0</td>
    </tr>
    <tr>
      <td>People</td>
      <td>1</td>
      <td>3</td>
      <td>4</td>
      <td>2</td>
      <td>2</td>
    </tr>
    <tr>
      <td rowspan="3"><strong>Output (1pt each)</strong></td>
      <td>Tip Amount</td>
      <td>$1.01</td>
      <td>$1.01</td>
      <td>$11.25</td>
      <td>$18.90</td>
      <td>$0.00</td>
    </tr>
    <tr>
      <td>Total</td>
      <td>$11.11</td>
      <td>$11.11</td>
      <td>$56.25</td>
      <td>$139.30</td>
      <td>$25.00</td>
    </tr>
    <tr>
      <td>Per Person</td>
      <td>$11.11</td>
      <td>$3.70</td>
      <td>$14.06</td>
      <td>$69.65</td>
      <td>$12.50</td>
    </tr>
  </tbody>
</table>


### Extra Credit
 - 2pts: Only print the line that shows how much each person pays if there is more than 1 person splitting the bill
 - 1pts: Include at least one emoji that is printed to the console 
 - 1pts: Print a special message (of your choosing) if the user does a tip percentage more than 20% 
