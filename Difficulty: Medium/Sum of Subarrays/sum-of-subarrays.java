class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-i;
            
            int count=left*right;
            
            sum+=count*arr[i];
        }
        return sum;
    }
}
