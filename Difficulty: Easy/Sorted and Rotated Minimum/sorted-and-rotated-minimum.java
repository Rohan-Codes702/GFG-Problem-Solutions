class Solution {
    public int findMin(int[] arr) {
        // code here
        int i=0;
        int j=arr.length-1;
        int min=Integer.MAX_VALUE;
        while(i<=j){
           min=Math.min(min,arr[j]);
           min=Math.min(min,arr[i]);
           i++;
           j--;
            
        }
        return min;
    }
}
