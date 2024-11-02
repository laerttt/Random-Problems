from typing import List
def arraySign(nums: List[int]) -> int:
    count = 0
    for i in range(len(nums)):
        if nums[i] < 0:
            count += 1
    if count % 2 == 0 and 0 not in nums:
        return 1
    elif 0 in nums:
        return 0 
    return -1        

example1 = [-1,-2,-3,-4,3,2,1]       
print(arraySign(nums=example1))
# Expected output => 1
example2 = [1,5,0,2,-3]       
print(arraySign(nums=example2))
# Expected output => 0
example3 = [-1,1,-1,1,-1]     
print(arraySign(nums=example3))
# Expected output => -1
        