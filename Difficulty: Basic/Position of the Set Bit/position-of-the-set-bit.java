class Solution {
    public int findPosition(int n) {
        // code here
        int count=1;
        if((n==0) || (n&(n-1))!=0){
            return -1;
        }
        while((n&1)!=1){
            n=n>>1;
            count++;
        }
        
        return count;
    }
}