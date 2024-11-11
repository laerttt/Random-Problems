from typing import List

def solution(nums1: List[int], nums2: List[int]) -> List[List[int]]:
    # Initialize two lists to store the differences
    dif1 = []  # To store elements in nums1 but not in nums2
    dif2 = []  # To store elements in nums2 but not in nums1
    # Iterate through nums1 to find elements that are not in nums2
    for num in nums1:
        # If the number is in nums2, it's not a unique difference, so skip it
        if num in nums2:
            pass
        else:
            # If the number isn't already in dif1, add it
            if num in dif1:
                pass
            else:
                dif1.append(num)
    # Iterate through nums2 to find elements that are not in nums1
    for num in nums2:
        # If the number is in nums1, it's not a unique difference, so skip it
        if num in nums1:
            pass
        else:
            # If the number isn't already in dif2, add it
            if num in dif2:
                pass
            else:
                dif2.append(num)
    # Return a list containing both difference lists
    return [dif1, dif2]

# Example 1:
nums1 = [1, 2, 3]
nums2 = [2, 4, 6]
print(solution(nums1, nums2))
# Output: [[1, 3], [4, 6]]
# Explanation: The elements 1 and 3 are in nums1 but not in nums2,
# and the elements 4 and 6 are in nums2 but not in nums1.

# Example 2:
nums1 = [1, 2, 3, 3]
nums2 = [1, 1, 2, 2]
print(solution(nums1, nums2))
# Output: [[3], []]
# Explanation: The element 3 is in nums1 but not in nums2,
# and there are no unique elements in nums2 that aren't in nums1.