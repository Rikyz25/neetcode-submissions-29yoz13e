class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solution(target, 0, nums, subset, res, 0);
        return res;
    }

    private void solution(int target, int i, int[] nums,
                          List<Integer> subset,
                          List<List<Integer>> res,
                          int sum) {

        // ✅ base cases
        if (sum == target) {
            res.add(new ArrayList<>(subset));
            return;
        }

        if (i == nums.length || sum > target) {
            return;
        }

        // ✅ TAKE the element
        subset.add(nums[i]);
        solution(target, i, nums, subset, res, sum + nums[i]);

        // ✅ BACKTRACK
        subset.remove(subset.size() - 1);

        // ✅ SKIP the element
        solution(target, i + 1, nums, subset, res, sum);
    }
}