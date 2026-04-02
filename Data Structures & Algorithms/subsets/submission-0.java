class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol= new ArrayList<>();
        List<Integer> lst=new ArrayList<>();

        solution(nums,0,lst,sol);
        return sol;

    }
    private void solution(int[] nums,int i,List<Integer> lst,List<List<Integer>> sol){
        if(i>=nums.length){
            sol.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[i]);
        solution(nums,i+1,lst,sol);
        lst.remove(lst.size()-1);
        solution(nums,i+1,lst,sol);
    }
}
