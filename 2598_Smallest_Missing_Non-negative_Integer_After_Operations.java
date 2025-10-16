/*
Problem: 2598. Smallest Missing Non-negative Integer After Operations
TC: O(n)
SC: O(value)
*/
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] remainderCount = new int[value];
        for(int num : nums){
            int remainder = ((num%value)+value)%value;
            remainderCount[remainder]++;
        }
        int i=0;
        while(true){
            int requiredRemainder = i%value;
            if (remainderCount[requiredRemainder]==0){
                return i;
            }
            remainderCount[requiredRemainder]--;
            i++;
        }
    }
}
