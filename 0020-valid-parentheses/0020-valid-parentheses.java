class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        for (char l: s.toCharArray()) {

            if (l == '(' || l == '{' || l == '[') {
                st.push(map.get(l));
            } else {

                if (st.empty() || st.pop() != l) {
                    return false;
                }

            }
        }

        return st.empty();
    }
}