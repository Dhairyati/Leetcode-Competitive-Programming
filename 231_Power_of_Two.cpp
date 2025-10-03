/*
Date solved: 15-08-25
Problem: 231. Power of Two
Solution Language: C++
Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
public:
    bool isPowerOfTwo(int n) {
    if (n <= 0) {
        return false;
    }
    int result = n & (n - 1);
    if (result == 0) {
        return true;
    } else {
        return false;
    }
    }
    
};
