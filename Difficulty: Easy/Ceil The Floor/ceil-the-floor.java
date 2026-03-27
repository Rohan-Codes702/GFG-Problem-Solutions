// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int flr=-1;
        int cl=-1;
        
        for(int i=0;i<n;i++){
             if(arr[i] == x){          
                flr = x;
                cl = x;
                break;
            }
            
            
            if(arr[i]<x){
                flr=Math.max(flr,arr[i]);
            }
            if(arr[i]>x){
                if(cl==-1){
                    cl=arr[i];
                }
            }
        }
         int res[]={flr,cl};
         return res;
        
    }
}
