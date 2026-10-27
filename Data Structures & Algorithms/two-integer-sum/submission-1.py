class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        li=[]
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    li.append(i)
                    li.append(j)
        return li