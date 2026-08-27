class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>>list=new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            ArrayList<Integer>lst=new ArrayList<>();
            for(int j=i
            ;j<n;j++){
                lst.add(arr[j]);
                list.add(new ArrayList<>(lst));
            }
            
        }
        return list;
    }
}