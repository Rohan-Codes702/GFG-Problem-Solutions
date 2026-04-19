// User function Template for Java

class Solution {
    public int findMaximum(int[] nums) {
        // code here
        int n=nums.length;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}