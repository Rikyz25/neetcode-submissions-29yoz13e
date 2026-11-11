class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        heapq.heapify(nums)
        sort=[]
        for i in range(len(nums)):
            sort.append(heapq.heappop(nums))
        return sort
