class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int n=arr.length;
        int firstindex=-1;
        int second=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
               firstindex=i;
               
               if(second!=-1){
                   min=Math.min(min,Math.abs(second-firstindex));
               }
            }
            if(arr[i]==y){
                 second=i;
               
               if(firstindex!=-1){
                   min=Math.min(min,Math.abs(second-firstindex));
               }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}