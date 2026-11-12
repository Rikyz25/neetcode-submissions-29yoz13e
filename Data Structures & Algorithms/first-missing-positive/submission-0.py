class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        i = 0
        n = len(nums)

        while i < n:
            x = nums[i] - 1

            if 1 <= nums[i] <= n and nums[i] != nums[x]:
                nums[i], nums[x] = nums[x], nums[i]
            else:
                i += 1

        i = 0
        while i < n:
            if nums[i] != i + 1:
                return i + 1
            i += 1

        return n + 1