# Calorie Counting Solution

This solution addresses the "Calorie Counting" problem for Santa's elves as they calculate their calorie intake to ensure enough energy for their journey. This solution calculates both:
1. The maximum calories carried by any single elf.
2. The total calories carried by the top three elves with the highest calorie loads.

## Files

- **CalorieCounting.java**: Contains the main code with methods to process the input and calculate the required results.
- **answers.txt**: Holds the answers to Parts 1 and 2 based on the provided input data.

## Solution Overview

### Part 1

- The program parses the input to sum up calories for each elf. Blank lines separate each elf's inventory.
- It calculates the maximum calories carried by a single elf by identifying the highest total calorie count.

### Part 2

- After identifying calorie totals per elf, the program sorts these values in descending order.
- The top three calorie values are summed to provide the answer.

### How to Run

1. Ensure that `CalorieCounting.java` is in your Java project.
2. Compile and run the program:
   ```bash
   javac CalorieCounting.java
   java CalorieCounting