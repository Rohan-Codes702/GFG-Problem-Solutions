class Solution {
    public char extraChar(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        for (int j = 0; j < s2.length(); j++) {
            char ch = s2.charAt(j);
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return ch;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return ' ';
    }
}