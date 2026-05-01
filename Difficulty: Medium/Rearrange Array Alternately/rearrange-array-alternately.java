class Solution {
    public void rearrange(int arr[]) {
        // code here
        int n=arr.length;
        
        int []large=new int[(n+1)/2];
        int []small=new int[n/2];
        
        int s=(n+1)/2;
        Arrays.sort(arr);
        
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(s!=0){
                large[j++]=arr[i];
                s--;
            }
        }
        int z=n/2;
        int idx=0;
        for(int i=0;i<n;i++){
            if(z!=0){
                small[idx++]=arr[i];
                z--;
            }
        }
        int k=0;
        int p=0;
        int r=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[k++]=large[p++];
            }
            else{
                arr[k++]=small[r++];
            }
        }
    }
}
