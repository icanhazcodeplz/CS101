# CS101 Homework 1: ASCII Flipbook Animation

## Learning Objectives

In completing this assignment, you will practice using:

- `System.out.println()` - Print text to the console
- `while (true)` loops - Repeat code until user exits program 
- `Thread.sleep()` - Pause execution for a specified time
- Escape sequences (`\n`, `\t`, `\\`, `\"`). Not required for assignment, but might be useful.

---

## Background

A flipbook is a booklet with a series of images that vary gradually from one page to the next. When you flip through the pages rapidly, the images appear to animate. We'll create a digital version using ASCII art and Java!

This assignment is based on the YouTube tutorial [Animated ASCII Art Java Code #5](https://youtu.be/zEIsf-QhHxQ?si=Qxyi4QSaIkcfSh8D). I recommend watching the video before starting the assignment.

---

## Instructions

1. Create a new file called `hw1FlipBook.java`
2. Copy the code from the example file [hw1FlipBook.java](https://github.com/icanhazcodeplz/CS101/blob/main/homeworks/hw1_flip_book/hw1FlipBook.java)
3. Complete the `TODO` sections to make your ASCII art animate
4. Your animation must:
   - Use a `while` loop to cycle through at least 4 frames (but no more than 8)
   - Use `Thread.sleep()` to control animation speed
   - Loop continuously until the user stops the program (Ctrl+C)

---

## Ideas for Your Animation

Be creative! Here are some ideas:
- A bouncing ball
- A blinking face
- A walking figure
- A growing/shrinking shape

---

## How to Run Your Program

1. Open a terminal and navigate to your file's directory
2. Compile your program:
   ```bash
   javac hw1FlipBook.java
   ```
3. Run your program:
   ```bash
   java hw1FlipBook
   ```
4. Press `Ctrl+C` to stop the animation

---

## Submission

Upload your completed `hw1FlipBook.java` file to Canvas.

**Grading Criteria:**
- Program compiles and runs without errors (25%)
- Animation has at least 4 frames, but no more than 8 (25%)
- Code is organized and easy to read (25%). As long as you don't drastically reformat the code in the example `hw1FlipBook.java`, you will get full credit here. 
- Frames flow together to create an animation, not just random frames put together (25%)

---

## FlipBook Competition (Winner gets 10% Extra Credit Bonus)

Once everyone has submitted their work we will do an anonymous competition. I'll show each animation on the big screen, 
and people will vote on their top two favorites. The winner of the competition will receive a 10% extra credit bonus for the 
assignment! 


