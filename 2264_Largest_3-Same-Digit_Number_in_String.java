/*
Date solved: 14-08-2025
Problem: 2264. Largest 3-Same-Digit Number in String
Solution Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String largestGoodInteger(String num) {
        char max=0;
    for (int i=0; i<num.length()-2; i++){
        char c=num.charAt(i);
        if (c==num.charAt(i+1) && c==num.charAt(i+2) && c>max) {
            max=c;
            if (max=='9') 
            break;
        }
    }
    return max==0 ? "":String.valueOf(max).repeat(3);
    }
}
