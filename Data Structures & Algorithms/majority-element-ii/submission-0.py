class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        n=len(nums)
        freq={}
        li=[]
        for i in range(n):
            freq[nums[i]]=freq.get(nums[i],0)+1
        for i in freq:
            if freq[i]>n//3:
                li.append(i)
        return li 