/*
Date solved: 13-08-2025
Problem: 326. Power of Three
Solution Language: C++
Time Complexity: O(1)
Space Complexity: O(1)
*/
class Solution {
public:
    bool isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
};
