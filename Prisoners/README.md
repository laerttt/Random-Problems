## 100 Prisoners Problem
 Video: [The Riddle That Seems Impossible Even If You Know The Answer - Veritasium](https://www.youtube.com/watch?v=iSNsgj1OCLA)

The director of a prison offers **100 death row prisoners**, numbered from 1 to 100, a last chance. In a room, there is a cupboard with **100 drawers**. The director randomly places one prisoner's number in each of the closed drawers. The prisoners enter the room, one by one, and each may open **up to 50 drawers** in any order. Once a drawer is opened, it is closed again.

### Objective:
- If **every prisoner** finds their own number in one of the drawers, all prisoners are pardoned.
- If **just one prisoner** fails to find their number, all prisoners die.

### Rules:
- Before the first prisoner enters the room, the prisoners may **discuss a strategy**.
- Once the first prisoner enters to begin the search, they may not communicate with others.

### Best Strategy:
1. **Start by opening the drawer labeled with their own number.**
2. If the drawer contains their number, they are done and have succeeded.
3. If the drawer contains the number of another prisoner, the prisoner then opens the drawer labeled with this number.
4. Repeat steps 2 and 3, following the sequence of numbers, until the prisoner either finds their own number or fails after opening 50 drawers.

### Task:
Simulate this riddle **at least 100,000 times** and track the **success rate**. The expected success rate should be around **30%**.

### Requirements:
- **Split the simulation** into multiple methods, each handling a specific task such as:
    - Generating random numbers for the drawers.
    - Creating random drawer arrangements.
    - Simulating the search process for each prisoner.
    - Calculating and printing the success rate of the strategy.