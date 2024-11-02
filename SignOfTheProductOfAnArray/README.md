### Sign Of The Product Of An Array
Implement a function signFunc(x) that returns:  
`1` if `x`is positive.
`-1` if` x` is negative.
`0` if `x`is equal to 0.

---
**Example 1:**  
Input: `nums = [-1,-2,-3,-4,3,2,1]`  
Output: `1`  
```
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
```
**Example 1:**  
Input: `nums = [1,5,0,2,-3]`  
Output: `0`  
```
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
```
**Example 1:**  
Input: `nums = [-1,1,-1,1,-1]`  
Output: `-1`  
```
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
```
Constraints:
- 1 <= `nums.length` <= 1000
- 100 <= `nums[i]` <= 100
---
`$ python3 main.py`