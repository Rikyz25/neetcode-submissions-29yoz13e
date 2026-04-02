class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int i=0;
        int j=numbers.length-1;
        while(true){
            if(numbers[i]+numbers[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
            if(numbers[i]+numbers[j]<target) i++;
            if(numbers[i]+numbers[j]>target) j--;
        }
        
    }
}
