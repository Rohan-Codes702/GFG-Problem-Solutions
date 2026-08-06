class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        HashSet<Character>set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        for(char i:str2.toCharArray()){
            set.add(i);
        }
        
        for(char i:str1.toCharArray()){
            if(!set.contains(i)){
                str.append(i);
            }
        }
        return str.toString();
    }
}