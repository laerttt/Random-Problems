### Avg Salary Excluding Min And Max

You are given an array of unique integers salary where `salary[i]` is the salary of the i<sup>th</sup> employee. Return the average salary of employees excluding the minimum and maximum salary.

---
**Example 1:**  
Input: `salary = [4000,3000,1000,2000]`  
Output: `2500.00000`  
```
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
```

**Example 2:**  
Input: `salary = [1000,2000,3000]`  
Output: `2000.00000`  
```
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
```

**Constraints:**  
3 <= `salary.length` <= 100  
1000 <= `salary[i]` <= 106  
All the integers of salary are unique.  

---
`$ python3 main.py`
