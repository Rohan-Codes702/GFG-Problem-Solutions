class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
         ArrayList<Integer>list=new ArrayList<>();
         int n=arr.length;
         int right=arr[n-1];
         list.add(arr[n-1]);
         for(int i=n-2;i>=0;i--){
             if(arr[i]>=right){
                 list.add(arr[i]);
                 right=arr[i];
             }
         }
         Collections.reverse(list);
         return list;
    }
}