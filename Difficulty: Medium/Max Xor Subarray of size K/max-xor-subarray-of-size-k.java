class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n=arr.length;
        int l=0;
        int r=k-1;
        int sum=0;
        
        for(int i=l;i<=r;i++ ){
            sum=sum^arr[i];
        }
        int max=sum;
        while(r<n-1){
            sum=sum^arr[l];
            l++;
            r++;
            sum=sum^arr[r];
            max=Math.max(sum,max);
        }
        return max;
    }
}
