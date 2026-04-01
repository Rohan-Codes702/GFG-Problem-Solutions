class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int m=n;
        int num=0;
        while(m!=0){
            int rem=m%10;
            num=(10*num)+rem;
            m=m/10;
        }
        if(num==n){
            return true;
        }
        return false;
    }
}