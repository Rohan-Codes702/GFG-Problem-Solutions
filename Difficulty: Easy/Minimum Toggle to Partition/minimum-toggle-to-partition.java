class Solution {
    int minToggle(int[] arr) {
        // code here
        int n=arr.length;
        int zero=0;
        for(int i:arr){
            if(i==0){
                zero++;
            }
        }
        
        int left=0;
        int right=zero;
        
        int ans=right;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                left++;
            }
            else{
                right--;
            }
            
            ans=Integer.min(ans,left+right);
        }
        
        return ans;
    }
}