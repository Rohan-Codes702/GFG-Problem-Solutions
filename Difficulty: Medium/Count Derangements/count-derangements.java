class Solution {
    public int derangeCount(int n) {
        // code here
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        
        int f=0;
        int s=1;
        
        for(int i=3;i<=n;i++){
            int curr=(i-1)*(f+s);
            f=s;
            s=curr;
        }
        return s;
    }
};