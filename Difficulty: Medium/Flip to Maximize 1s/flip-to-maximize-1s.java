class Solution {
    int maxOnes(int[] arr) {
        // code here
        int n=arr.length;
        int totalones=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                totalones++;
            }
        }
        
        int maxGain=0;
        int currsum=0;
        
        for(int i=0;i<n;i++){
            int val=(arr[i]==0)?1 : -1;
            
            currsum=Math.max(val,currsum+val);
             maxGain= Math.max(maxGain, currsum);
        }
        
        return totalones+maxGain;
    }
};