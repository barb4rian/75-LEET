class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // First check: if str1 + str2 != str2 + str1, no common divisor exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // The length of the GCD string will be GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return the substring of str1 from index 0 to gcdLength
        return str1.substring(0, gcdLength);
    }
    
    // Helper method to compute GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}