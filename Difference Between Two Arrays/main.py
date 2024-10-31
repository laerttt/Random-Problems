from typing import List

def solution(nums1: List[int], nums2: List[int]) -> List[List[int]]:
        dif1 = []
        dif2 = []

        for num in nums1:
            if num in nums2:
                pass
            else:
                if num in dif1:
                    pass
                else:
                    dif1.append(num)
        for num in nums2:
            if num in nums1:
                pass
            else:
                if num in dif2:
                    pass
                else:
                    dif2.append(num)
        return [dif1, dif2]

# Example 1:
nums1 = [1,2,3]
nums2 = [2,4,6]
print(solution(nums1,nums2))
# Output: [[1,3],[4,6]]

# Example 2:
nums1 = [1,2,3,3]
nums2 = [1,1,2,2]
print(solution(nums1,nums2))
# Output: [[3],[]]
