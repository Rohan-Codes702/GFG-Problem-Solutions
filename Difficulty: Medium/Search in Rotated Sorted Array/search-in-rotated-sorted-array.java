class Solution {
    int search(int[] arr, int key) {
        // code here
        int n=arr.length;
        
        int i=0;
        int j=n-1;
        
        while(i<=j){
            if(arr[i]==key){
                return i;
            }
            if(arr[j]==key){
                return j;
            }
            
            i++;
            j--;
        }
        return -1;
    }
}