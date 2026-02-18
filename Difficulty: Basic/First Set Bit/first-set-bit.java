// User function Template for Java

class Solution {
    static int findPosition(int n) {
        // code here
        int set=0;
        int pos=0;
        int ans=-1;
        while(n!=0){
            pos++;
            if((n&1)==1){
                set++;
                ans=pos;
            }
            
           n= n>>1;
            
        }
        if(set>1 || set==0){
            return -1;
        }
        return ans;
    }
};