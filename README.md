# Guess_the_number

The Java program is a number guessing game where the player guesses a random number between 0 and an upper limit. The game starts with 100 points, deducts points for incorrect guesses, and awards points for correct guesses. The upper limit is adjusted based on the player's points.

## Table of Contents

- [About](#about)
- [Features](#features)
- [Imports](#Imports)
- [Ratting: 7.5/10](#Ratting)

# About

The Java program is a number guessing game where the player guesses a random number between 0 and an upper limit. It starts with a fixed point range and generates a random number within it. If the guess is incorrect, the player is informed and points are deducted for each incorrect guess. The upper limit for the random number is adjusted based on the player's current points. The game continues until the player runs out of points.

# Imports

Random, Scanner

# Ratting

The code for a number guessing game is well-organized and well-read, with clear variable names and comments explaining the purpose of each section. However, there are some inconsistencies in naming conventions, and the code could benefit from more whitespace.
The game functions as intended, allowing the user to input guesses and providing feedback on whether the guess is too high, too low, or correct. It handles invalid input by informing the user that only numbers are accepted. The game ends when the user runs out of points, but there is no mechanism for exiting the game gracefully.
Error handling is present for non-integer input, but only resets points to zero without providing any message indicating why the game ended. Adding more descriptive error messages for different types of input errors would improve the user experience.
The code appears to be efficient in terms of resource usage and execution time, running smoothly and providing a responsive user experience. Overall, the code is a simple yet effective implementation, providing an enjoyable experience for users to test their guessing skills. However, adding additional features like a menu system, difficulty levels, or a scoring system could further enhance the game. Overall, the code demonstrates a good understanding of basic Java programming concepts and logic.
