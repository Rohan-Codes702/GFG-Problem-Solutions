class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int n=arr.length;
        if(arr.length == 0) return 0;
        int count=0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>=max){
                count++;
                max=arr[i];
            }
        }
        return count;
    }
}