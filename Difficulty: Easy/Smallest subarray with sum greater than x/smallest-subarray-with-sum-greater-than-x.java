// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int n=arr.length;
        int l=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            
            while(sum>x){
                int len=r-l+1;
                min=Math.min(min,len);
                sum=sum-arr[l];
                l++;
                
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
