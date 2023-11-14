class Solution {
    public boolean isPalindrome(String s) {
        
         s = s.toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (!isAlphanumeric(s.charAt(start)) && start < end) {
                start++;
            }
            while (!isAlphanumeric(s.charAt(end)) && start < end) {
                end--;
            }

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
        
    }
    public static boolean isAlphanumeric(char c) {

        return (c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}