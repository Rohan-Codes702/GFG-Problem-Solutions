class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        
        
        int j=0;
        for(int i=0;i<list.size();i++){
            arr[j++]=list.get(i);
        }
        
        while(j<n){
            arr[j++]=0;
        }
        
    }
}