class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i:arr){
            list.add(i);
        }
        
        Collections.rotate(list,-d);
        
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
    }
    
}