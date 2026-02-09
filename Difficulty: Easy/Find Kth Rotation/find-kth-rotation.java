class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int cnt=0;
        
        int min=Integer.MAX_VALUE;
        
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min){
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt;
    }
}