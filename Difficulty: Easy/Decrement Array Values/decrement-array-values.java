class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int []res=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i]-1;
        }
        return res;
    }
}