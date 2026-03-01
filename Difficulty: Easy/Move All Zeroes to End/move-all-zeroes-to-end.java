class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
            else{
                list.add(arr[i]);
            }
        }
        
        for(int i=0;i<zero;i++){
            list.add(0);
        }
        
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        
    }
}