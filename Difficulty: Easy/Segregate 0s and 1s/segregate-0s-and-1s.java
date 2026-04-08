class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length;
        int zr=0;
        int one=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zr++;
            }
            else{
                one++;
            }
        }
        
        int k=0;
        for(int i=0;i<zr;i++){
            arr[k]=0;
            k++;
        }
         for(int i=k;i<n;i++){
            arr[k]=1;
            k++;
        }
        
    }
}
