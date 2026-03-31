class Solution {
    public void sort012(int[] arr) {
        // code here
        int zcount=0;
        int ocount=0;
        int tcount=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zcount++;
            }
            else if(arr[i]==1){
                ocount++;
            }
            else{
                tcount++;
            }
        }
        int p=0;
        for(int i=0;i<n;i++){
            if(zcount!=0){
                arr[p++]=0;
                zcount--;
            }
        }
        for(int i=p;i<n;i++){
            if(ocount!=0){
                arr[p++]=1;
                ocount--;
            }
        }
        for(int i=p;i<n;i++){
            if(tcount!=0){
                arr[p++]=2;
                tcount--;
            }
        }
    }
}