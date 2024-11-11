from typing import List

def arraySign(nums: List[int]) -> int:
    # Initialize a counter to track the number of negative numbers in the array
    count = 0
    # Iterate over the numbers in the array to count how many are negative
    for i in range(len(nums)):
        if nums[i] < 0:  # Check if the current number is negative
            count += 1  # Increment the count if the number is negative
    # If the count of negative numbers is even and there are no zeros, return 1 (positive product)
    if count % 2 == 0 and 0 not in nums:
        return 1
    # If there's at least one zero in the array, the product will be zero
    elif 0 in nums:
        return 0
    # If the count of negative numbers is odd and there are no zeros, return -1 (negative product)
    return -1

# Example 1: List of numbers where the product is positive because there are an even number of negative numbers
example1 = [-1,-2,-3,-4,3,2,1]
print(arraySign(nums=example1))  # Expected output => 1
# Example 2: List of numbers containing zero, so the product is zero
example2 = [1,5,0,2,-3]
print(arraySign(nums=example2))  # Expected output => 0
# Example 3: List of numbers where the product is negative because there are an odd number of negative numbers
example3 = [-1,1,-1,1,-1]
print(arraySign(nums=example3))  # Expected output => -1