/*
Date solved: 12-08-2025
Problem: 2787. Ways to Express an Integer as Sum of Powers
Solution Language: C++
Time Complexity: 
Space Complexity: O(n)
*/

class Solution {
public:
    int numberOfWays(int n, int x) {
        constexpr int kMod = 1'000'000'007;
        vector<int> dp(n + 1);
        int ax;

        dp[0] = 1;

        for (int a = 1; (ax = pow(a, x)) <= n; ++a)
        for (int i = n; i >= ax; --i) {
            dp[i] += dp[i - ax];
            dp[i] %= kMod;
        }

        return dp[n];
    }
};
