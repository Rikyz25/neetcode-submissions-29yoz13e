class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        nums.sort();
        t=1
        p=1
        for i in range(len(nums)-1):
            if nums[i]+1==nums[i+1]:
                t=t+1
                p=max(p,t)
            elif nums[i]==nums[i+1]:
                continue
            else:
                t=1
        return p