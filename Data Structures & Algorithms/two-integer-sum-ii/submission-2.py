class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # Initialize two pointers at the start and end of the array
        left = 0
        right = len(numbers) - 1
        
        while left < right:
            current_sum = numbers[left] + numbers[right]
            
            if current_sum == target:
                # Return 1-indexed positions
                return [left + 1, right + 1]
            elif current_sum < target:
                # Sum is too small, move the left pointer to increase the sum
                left += 1
            else:
                # Sum is too large, move the right pointer to decrease the sum
                right -= 1
                
        return []
