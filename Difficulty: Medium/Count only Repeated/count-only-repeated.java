class Solution {
    public ArrayList<Integer> findRepeating(int[] arr) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int key:map.keySet()){
            if(map.get(key)>1){
                list.add(key);
                list.add(map.get(key));
            }
        }
        list.add(-1);
        list.add(-1);
        
        return list;
    }
}
