/*
Date solved: 15-09-2025
Problem: 1935. Maximum Number of Words You Can Type
Solution Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] isBrokenLetter = new boolean[26];
      
        for (char letter : brokenLetters.toCharArray()) {
            isBrokenLetter[letter - 'a'] = true;
        }
        int typableWordCount = 0;
        for (String word : text.split(" ")) {
            boolean canTypeWord = true;
            for (char character : word.toCharArray()) {
                if (isBrokenLetter[character - 'a']) {
                    canTypeWord = false;
                    break;
                }
            }
            if (canTypeWord) {
                typableWordCount++;
            }
        }
      
        return typableWordCount;
    }
}
