class Solution {
    static int numOfPerfectSquares(int a, int b) {
        // code here
        int count=0;
        for(int i=a;i<=b;i++){
            int num=(int )Math.sqrt(i);
            
            if(num*num==i){
                count++;
            }
        }
        return count;
    }
};