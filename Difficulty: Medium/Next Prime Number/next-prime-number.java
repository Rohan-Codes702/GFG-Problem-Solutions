// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        for(int i=n+1;i<=500;i++){
            if(helper(i)){
                return i;
            }
        }
        return -1;
    }
    public static boolean helper(int n){
        
        if(n<=1){
            return false;
        }
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}