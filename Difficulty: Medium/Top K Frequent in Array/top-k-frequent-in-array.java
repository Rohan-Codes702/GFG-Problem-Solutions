class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(map.keySet());
        
        Collections.sort(list,(a,b)->{
            if(map.get(a).equals(map.get(b))){
               return b-a;
            }
            return map.get(b)-map.get(a);
            
        });
        
        return new ArrayList<>(list.subList(0, k));
        
    }
}
