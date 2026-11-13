class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
            
        k = 1  # Points to the index where the next unique element should go
        
        for r in range(1, len(nums)):
            if nums[r] != nums[r - 1]:
                nums[k] = nums[r]
                k += 1
                
        return k
