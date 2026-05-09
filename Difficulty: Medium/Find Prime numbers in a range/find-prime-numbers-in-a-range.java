// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=M;i<=N;i++){
            if(isprime(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isprime(int n){
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