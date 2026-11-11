class Solution:
    def sortColors(self, nums: List[int]) -> None:
        heapq.heapify(nums)
        sort=[]
        for i in range(len(nums)):
            sort.append(heapq.heappop(nums))
        for i in range(len(sort)):
            nums.append(sort[i])
        """
        Do not return anything, modify nums in-place instead.
        """
        