// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int min=Integer.MAX_VALUE;
        
        min=Math.min(min,a+b);
       min= Math.min(min,a-b);
        min=Math.min(min,a*b);
        if(b!=0){
           min= Math.min(min,a/b);
        }
        return min;
        
    }
}