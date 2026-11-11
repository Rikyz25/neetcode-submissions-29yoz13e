class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        counts = {}
        majority_threshold = len(nums) // 2
        
        for num in nums:
            # 1. Update the count for the current number
            counts[num] = counts.get(num, 0) + 1
            
            # 2. Early return if this number crosses the threshold
            if counts[num] > majority_threshold:
                return num
