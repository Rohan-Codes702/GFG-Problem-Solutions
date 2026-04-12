class Solution {
    public int num(int k, int arr[]) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            while(n!=0){
                int rem=n%10;
                if(rem==k){
                    count++;
                }
                n=n/10;
            }
        }
        return count;
    }
}