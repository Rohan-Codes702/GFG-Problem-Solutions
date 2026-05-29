class Solution {
    public String maximumFrequency(String s) {
        // Your Code goes here
        int n=s.length();
        
        String []str=s.split(" ");
        
        HashMap<String,Integer>map=new HashMap<>();
        int maxFreq=0;
       for (String word : str) {
            map.put(word, map.getOrDefault(word, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(word));
        }
        String resultWord = "";
        for (String word : str) {
            if (map.get(word) == maxFreq) {
                resultWord = word;
                break; 
            }
        }
        return resultWord+" "+maxFreq;
        
        
        
    }
}