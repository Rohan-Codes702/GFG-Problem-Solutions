class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxfreq=0;
        char chr='-';
        for(char ch:map.keySet()){
            if(map.get(ch)>maxfreq ||  (map.get(ch) == maxfreq && ch < chr)){
                maxfreq=map.get(ch);
                chr=ch;
                
            }
        }
        return chr;
    }
}