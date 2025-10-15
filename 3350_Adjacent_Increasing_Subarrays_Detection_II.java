class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int maxl=0;
        int prevl=0;
        int currl=0;
        int n=nums.size();

        for(int i=0; i<n; i++){
            currl++;
            if(i==n-1 || nums.get(i)>=nums.get(i+1)){
                maxl=Math.max(maxl, Math.max(currl/2, Math.min(prevl, currl)));
                prevl=currl;
                currl=0;
            }
        }
        return maxl;
    }
}
