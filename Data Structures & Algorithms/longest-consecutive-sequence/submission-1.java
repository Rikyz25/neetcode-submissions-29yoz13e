class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int pstreak=1;
        int tstreak=1;
        int start=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1] ){
                tstreak++;
                pstreak=Math.max(tstreak,pstreak);
            }
            else if(i!=start && nums[i]==nums[i+1]){
                continue;
            }
            else{
                tstreak=1;
                start=i+1;
            }

        }
        return pstreak;
    
    }
}
