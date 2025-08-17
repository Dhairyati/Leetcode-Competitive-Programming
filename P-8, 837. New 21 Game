/*
Date solved: 17-08-2025
Problem: 837. New 21 Game
Solution Language: C++
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
public:
    double new21Game(int n, int k, int maxPts) {
        if (k==0 || n>=k-1+maxPts) return 1.0;

        vector<double> dp(n+1, 0.0);
        dp[0]=1.0;
        double windowSum=1.0; // sum of dp[j] with j < k and in last maxPts
        double res=0.0;

        for (int i=1; i<=n; i++) {
            dp[i]=windowSum/maxPts;
            if (i<k){
                windowSum+=dp[i];
            }else{
                res+=dp[i];
            }
            int j=i-maxPts;
            if (j>=0 && j<k) windowSum-=dp[j];
        }
        return res;
    }
};
