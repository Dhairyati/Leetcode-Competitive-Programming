/*
2221. Find Triangular Sum of an Array
*/

class Solution {
    public int triangularSum(int[] nums){
        for (int currentLength = nums.length-1; currentLength>0; currentLength--){
            for (int index=0; index<currentLength; index++){
                nums[index]=(nums[index] + nums[index+1]) % 10;
            }
        }
        return nums[0];
    }
}
