/*
Problem: 53. Maximum Subarray
TC: O(n)
SC: O(1)
Concept: Kadane's Algorithm
*/

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if (nums.empty()){
            return 0;
        }
        int maxfinal = nums[0];
        int current_max = nums[0];
        for(int i=1; i<nums.size(); i++){
            current_max=max(nums[i], current_max + nums[i]);
            maxfinal=max(maxfinal, current_max);
        }
        return maxfinal;
    }
};
