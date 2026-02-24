// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int []res=new int[n];
       
       if(n>=1){
           res[0]=0;
       }
       if(n>=2){
           res[1]=1;
       }
       for(int i=2;i<n;i++){
           res[i]=res[i-1]+res[i-2];
           
       }
       return res;
       
    }
}