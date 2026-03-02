class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int n=arr.length;
        
       int count=1;
       int max=1;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                count=1;
            }
            else{
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
