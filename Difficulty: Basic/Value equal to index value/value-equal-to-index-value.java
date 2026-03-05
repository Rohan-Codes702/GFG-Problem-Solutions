class Solution {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                list.add(arr[i]);
            }
        }
        return list;
        
    }
}
