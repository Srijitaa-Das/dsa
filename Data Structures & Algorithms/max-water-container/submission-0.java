class Solution {
    public int maxArea(int[] heights) {
      int area=1;
      int res = 0;
      int st=0;
      int end=heights.length-1;
      while(st<end){
        area = Math.min(heights[st], heights[end]) * (end - st);
        res = Math.max(res, area);
        if(heights[st]>heights[end]){
            end--;
        }
        else{
            st++;
        }
      }
      return res;       
    }
}
