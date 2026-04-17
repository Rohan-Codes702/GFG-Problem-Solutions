// User function Template for Java

class Solution {
    long findMinSum(int[] A, int[] B, int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        long ans=0;
        
        for(int i=0;i<A.length;i++){
            ans+=Math.abs((long)A[i]-(long)B[i]);
        }
        return ans;
        
    }
}