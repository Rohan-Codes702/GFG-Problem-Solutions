class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        int n=arr.length;
        int[]res=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        int idx=0;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            else{
                res[idx++]=arr[i];
            }
        }
        return res;
    }
}