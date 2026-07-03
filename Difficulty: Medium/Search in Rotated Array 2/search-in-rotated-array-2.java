class Solution {
    public Boolean search(int[] nums, int target) {
        
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            if(nums[i]==target){
                return true;
            }
            else if(nums[j]==target){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}