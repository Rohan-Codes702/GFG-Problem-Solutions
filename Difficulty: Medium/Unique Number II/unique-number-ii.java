class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        ArrayList<Integer>list=new ArrayList<>();
        
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int j=0;
        
        for(int key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        
        Collections.sort(list);
        int []res=new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        
        return res;
    }
}