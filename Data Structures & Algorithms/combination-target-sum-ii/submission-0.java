class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // 🔑 important
        backtrack(nums, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int target, int start,
                           List<Integer> curr, List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int j = start; j < nums.length; j++) {

            // 🔴 Skip duplicates
            if (j > start && nums[j] == nums[j - 1]) continue;

            // 🔴 Stop early (since sorted)
            if (nums[j] > target) break;

            // ✅ Choose
            curr.add(nums[j]);

            // ❗ Move to next index (no reuse)
            backtrack(nums, target - nums[j], j + 1, curr, res);

            // ✅ Backtrack
            curr.remove(curr.size() - 1);
        }
    }
}