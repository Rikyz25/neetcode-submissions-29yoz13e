class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] nums1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    p=p*nums[j];
                }
            }
            nums1[i]=p;

        }
        return nums1;

    }
}  
