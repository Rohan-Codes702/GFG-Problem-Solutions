class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        // code here
        int n=arr.size();
        
        int maxSum=0;
        
        for(int i=0;i<m;i++){
            maxSum+=arr.get(i);
        }
        int sum=maxSum;
        for(int j=m;j<n + m - 1;j++){
            sum=sum-arr.get((j-m)%n);
            sum+=arr.get((j)%n);
            
            maxSum=Math.max(maxSum,sum);
            
        }
        return maxSum;
    }
}