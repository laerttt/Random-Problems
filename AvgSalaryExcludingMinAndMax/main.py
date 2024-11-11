from typing import List

def solution(salary: List[int]) -> float:
    # Initialize variables to keep track of the maximum, minimum, and the sum of the salaries
    max = 0  # To store the highest salary
    min = 9999999  # To store the lowest salary (a large initial value)
    avg = 0  # To store the sum of all salaries
    # Loop through each salary in the input list
    for sal in salary:
        avg += sal  # Add the current salary to the total sum
        # Update the maximum salary if the current salary is greater than the current max
        if sal > max:
            max = sal
        # Update the minimum salary if the current salary is less than the current min
        if sal < min:
            min = sal
    # Calculate the average excluding the maximum and minimum salaries
    # We subtract the max and min from the sum and divide by the length of the salary list minus 2
    return (avg - max - min) / (len(salary) - 2)

# Example 1:
salary = [4000, 3000, 1000, 2000]
print(solution(salary))  # Expected output: 2500
# Example 2:
salary = [1000, 2000, 3000]
print(solution(salary))  # Expected output: 2000