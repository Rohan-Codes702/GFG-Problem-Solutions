// User function Template for Java

class Solution {
    public int minNumber(int arr[], int N) {
        int n=arr.length;
        
        int sum=0;
        int add=0;
        for(int i:arr){
            sum+=i;
        }
        
        while(!isprime(sum)){
            sum=sum+1;
            add++;
        }
        return add;
        
        
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
