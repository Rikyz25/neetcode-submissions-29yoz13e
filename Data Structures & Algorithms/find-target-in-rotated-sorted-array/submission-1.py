class Solution:
    def search(self, nums: List[int], target: int) -> int:
        res=-1
        if target in nums:
            res=nums.index(target)
        return res
        