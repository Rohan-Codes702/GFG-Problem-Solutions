class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int curr=0;
        
        for(int i=0;i<n;i++){
           curr+=arr[i];
           
           if(curr>max){
               max=curr;
           }
           
           if(curr<0){
               curr=0;
           }
            
        }
        return max;
    }
}
