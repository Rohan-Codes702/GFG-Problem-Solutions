import java.util.*;

class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        
        int n1 = s1.length();
        int n2 = s2.length();
        
        if(n1 != n2) return false;

        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i=0;i<n1;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2){
                    return false;
                }
            }
            else{
                if(map.containsValue(c2)){
                    return false;
                }

                map.put(c1,c2);
            }
        }
        return true;

    }
    
}