// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        int n=s.length();
        StringBuilder str=new StringBuilder();
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            
            if(map.containsKey(ch) && map.get(ch)>=1){
                str.append(ch);
                map.remove(ch);
            }
        }
        return str.toString();
    }
}