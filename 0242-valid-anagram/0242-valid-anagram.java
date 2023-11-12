class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> s_count = new HashMap<>();
        HashMap<Character, Integer> t_count = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            char key_s = s.charAt(i);

            if (s_count.containsKey(key_s)) {
                s_count.put(key_s, s_count.get(key_s) + 1);
            } else {
                s_count.put(key_s, 0);
            }

            char key_t = t.charAt(i);

            if (t_count.containsKey(key_t)) {
                t_count.put(key_t, t_count.get(key_t) + 1);
            } else {
                t_count.put(key_t, 0);
            }

        }


        for (Character key: s_count.keySet()) {

            if (!Objects.equals(s_count.get(key), t_count.get(key))) {
                return false;
            }
        }

        return true;
        
    }
}