class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int tarea=0;
        int parea=0;
        while(i<j){
            tarea=(j - i) * Math.min(heights[i], heights[j]);
            parea=Math.max(parea,tarea);
            if(heights[i]<=heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return parea;
    }
}
