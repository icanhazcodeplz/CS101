# CS101 Homework 3 - Mario Blocks

* Based on [CS50 Mario](https://cs50.harvard.edu/x/psets/1/mario/more/) (adapted to Java)
  * I recommend you watch the "Walkthrough" video about halfway down the page. It describes how to get started in `C`, but the Java implementation will be very similar.
* [Super Mario Bros - Full Game Walkthrough (NES)](https://youtu.be/cWOkHQXw0JQ?si=XOe8clBqom_Bl8Hw)
---

## Background

In the original Super Mario Bros, Mario must jump over pyramids of blocks as he nears the end of a level. Your task is to recreate those pyramids in Java using `#` symbols.

Your program should print **two pyramids** side by side, separated by a **two-space gap**, like this (height 3):

```
  #  #
 ##  ##
###  ###
```

---

## Requirements

1. **Prompt the user** for the pyramid height with: `Height: `
2. The height must be a **positive integer between 1 and 8** (inclusive)
3. If the user enters an invalid value (negative, zero, greater than 8), **re-prompt** them until they provide a valid height
   * You are NOT required to handle non-integer inputs, which is required in the cs50 Harvard assignment
4. Print the double pyramid using `#` characters with a **two-space gap** between the left and right pyramids
5. Use **spaces** (not tabs) for alignment

---

## Examples

**Height 1:**
```
Height: 1
#  #
```

**Height 8:**
```
Height: 8
       #  #
      ##  ##
     ###  ###
    ####  ####
   #####  #####
  ######  ######
 #######  #######
########  ########
```

**Invalid input (re-prompting):**
```
Height: -1
Height: 0
Height: 9
Height: 4
   #  #
  ##  ##
 ###  ###
####  ####
```

---

## Grading (40 pts)

 - 5pts: Program compiles without errors
 - 3pts: Source code has comments describing what each block of code does
 - 2pts: The program prompts the user for the pyramid height with: `Height: `
 - 20pts: If the user types a valid integer between 1 and 8 (inclusive), blocks are printed correctly
 - 10pts: If the user types an invalid integer, the program does not stop and asks for the `Height: ` again.

## Submission

Save your file as `hw3MarioBlocks.java` and submit it on Canvas.
