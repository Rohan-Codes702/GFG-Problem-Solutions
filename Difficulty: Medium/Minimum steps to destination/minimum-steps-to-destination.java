class Solution {
    static int minSteps(int d) {
        // code here
        d=Math.abs(d);
        int moves=0;
        int num=0;
        
        while(num<d || (num-d)%2!=0){
            moves++;
            num+=moves;
        }
        return moves;
    }
}