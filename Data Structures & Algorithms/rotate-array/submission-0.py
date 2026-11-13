class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k=k%len(nums)
        rot=[]
        for i in range(len(nums)-k,len(nums)):
            rot.append(nums[i])
        for i in range(0,len(nums)-k):
            rot.append(nums[i])
        for i in range(len(nums)):
            nums[i]=rot[i]
        """
        Do not return anything, modify nums in-place instead.
        """
        