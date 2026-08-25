class Solution {
    public int findDuplicate(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==k){
                return arr[i];
            }
        }
        return -1;
    }
};