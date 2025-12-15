class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        int i = 0;
        while(i < min) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
            i++;
        }
        if(word1.length() > min) {
            ans.append(word1.substring(i));
        } else if(word2.length() > min) {
            ans.append(word2.substring(i));
        }
        return ans.toString();
    }
} 