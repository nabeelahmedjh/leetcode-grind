class Solution {
    public boolean isPalindrome(String s) {
        
        String pal = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                pal += c;
            }
        }

        int n = pal.length();
        for (int i = 0; i < n/2; i++) {

            if (pal.charAt(i) != pal.charAt((n - 1) - i)) {
                return false;
            }
        }

        return true;

        
        
    }
}