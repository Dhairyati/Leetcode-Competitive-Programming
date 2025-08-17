/*
Date solved: 17-08-2025
Problem: 1323. Maximum 69 Number
Solution Language: C++
Time Complexity: O(d) where d<=5
Space Complexity: O(d) where d<=5
*/

class Solution {
public:
    int maximum69Number (int num) {
        string s = to_string(num);
        for (char &c : s){
            if (c=='6'){
                c='9';
                break;
            }
        }
        return stoi(s);
    }
};
