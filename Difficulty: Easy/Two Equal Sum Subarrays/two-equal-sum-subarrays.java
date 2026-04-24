class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        
        for(int i:arr){
            sum+=i;
        }
        
        int subsum=0;
        
        for(int i:arr){
            subsum+=i;
            
            if(subsum==(sum-subsum)){
                return true;
        }
        }
        
        return false;
    }
}