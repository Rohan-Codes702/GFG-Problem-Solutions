// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        HashMap<String,Integer>map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        
        for(String key:map.keySet()){
            int freq=map.get(key);
            
            if(freq>first){
                second=first;
                first=freq;
                
            }
            else if(freq<first && freq>second){
                second=freq;
            }
        }
        
        for(String key:map.keySet()){
            if(map.get(key)==second){
                return key;
            }
        }
        return "";
        
    }
}