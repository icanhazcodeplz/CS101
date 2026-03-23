# ⚡ CS101 Assignment: Pikachu Battle

You are going to create a simplified version of the battle sequences from the 
original [Pokemon GameBoy Games](https://en.wikipedia.org/wiki/Pok%C3%A9mon_Red,_Blue,_and_Yellow),
which were released in Japan in 1996. Here is an example of the gameplay: [Pokemon Yellow Playthrough](https://youtu.be/aqr_YgqF2vM?si=tyfHyJtzD-coVR0P&t=966)

## Overview
In this assignment, you will build a **text-based Pokémon battle game** in Java where your Pikachu battles an enemy Pikachu.

The goal of this project is to help you practice:
- Writing and calling **methods**
- Using **parameters and return values**
- Organizing a program into **logical pieces**
- Using **loops and conditionals**

---

## Game Description

You and the computer each control a Pikachu.

- Both start with **100 HP (health points)**
- Each turn:
  1. You choose a move
  2. Your Pikachu attacks
  3. The computer randomly chooses a move
  4. The enemy Pikachu attacks
- The game continues until one Pikachu reaches **0 HP**

---

## Available Moves

| Move            | Description                          | Damage Range               |
|-----------------|--------------------------------------|----------------------------|
| Thunderbolt     | Reliable medium damage               | 15–25 (10% chance of miss) |
| Thunder         | Strong attack, but may miss          | 25–35 (30% chance of miss) |


---

## Assignment

Start by downloading the stub file to your workspace: [hw4PikachuBattle.java](https://github.com/icanhazcodeplz/CS101/blob/main/homeworks/hw4_pikachu_battle/hw4PikachuBattle.java). 
This file should compile and run, but the game is not complete! Your task is to address all of the `TODO` comments such that the game is
working. You are welcome to make adjustments as you see fit to make the game more fun!

---

## Grading(40 points)

 - 5pts: Program compiles without errors
 - 3pts: User prompts are easy to understand. Think: If someone who has never seen your code tried playing, would they understand what to do?
 - 3pts: Printouts and gameflow make for a good user experience. Think: Does the user understand what is happening at each stage of the game?
 - 6pts: `getChoice` implemented correctly
 - 3pts: `getAttackName` implemented correctly
 - 14pts: `getDamage` implemented correctly
 - 6pts: `printAttackResult` implemented correctly

---

## Extra Credit (Up to 5pts)
Implement another move! Here is a list for inspiration: https://pokemondb.net/pokedex/pikachu/moves/1. 
Extra credit awarded based on how well the implementation is done. Up to 5 points extra max.


---

Good luck, and have fun building your Pikachu battle! ⚡
