from typing import List

def solution(salary: List[int]) -> float:
        max = 0
        min = 9999999
        avg = 0
        for sal in salary:
            avg += sal
            if sal > max:
                max = sal
            if sal < min:
                min = sal
        return (avg - max - min) / (len(salary) - 2)

# Example 1:
salary = [4000,3000,1000,2000]
print(solution(salary))
# Excpected 2500 
# Example 2:
salary = [1000,2000,3000]
print(solution(salary))
# Excpected 2000