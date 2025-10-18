/*
Problem: 3397. Maximum Number of Distinct Elements After Operations
TC: O(n log n)
SC: O(1)
*/

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
      
        int n=nums.length;
        int distinctc=0; //Distinct Count
        int prev_val=Integer.MIN_VALUE; //Previous Value
      
        for(int currnum : nums){
            int optimal_val=Math.min(currnum + k, Math.max(currnum-k, prev_val+1));
          
            if(optimal_val>prev_val){
                distinctc++;
                prev_val=optimal_val;
            }
        }
      
        return distinctc;
    }
}
