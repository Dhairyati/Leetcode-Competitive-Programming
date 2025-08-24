/*
Date solved: 24-08-2025
Problem: 1493. Longest Subarray of 1's After Deleting One Element
Solution Language: C++
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int n = nums.size();
        int left=0, zeros=0, res=0;

        for (int right=0; right<n; right++) {
            if (nums[right] == 0){
                zeros++;
            }
            while (zeros>1){
                if (nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            res = max(res, right-left);
        }

        return res;
    }
};
