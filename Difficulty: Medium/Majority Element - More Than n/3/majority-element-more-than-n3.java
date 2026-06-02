class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer>list=new ArrayList<>();
        
        int n=arr.length;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i:map.keySet()){
            if(n/3<map.get(i)){
                list.add(i);
            }
        }
        
        Collections.sort(list);
        return list;
    }
}