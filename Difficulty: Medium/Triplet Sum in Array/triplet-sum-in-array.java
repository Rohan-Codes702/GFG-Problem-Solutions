class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n=arr.length;
        
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
            int result=arr[i]+arr[left]+arr[right];
            
            if(result==target){
                return true;
            }
            else if(result>target){
                right--;
            }
            else{
                left++;
            }
            
            }
        }
        return false;
    }
}
