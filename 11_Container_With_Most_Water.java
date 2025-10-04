/*
11. Container With Most Water
Date: 04-10-2025
TC: O(n)
SC: O(1)
*/
class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int maxAreaFound=0;
        while (lp<rp){
            int currentHeight = Math.min(height[lp],height[rp]);
            int currentWidth = rp-lp;
            int currentArea = currentHeight*currentWidth;
          
            maxAreaFound = Math.max(maxAreaFound, currentArea);
            if (height[lp]<height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxAreaFound;
    }
}
