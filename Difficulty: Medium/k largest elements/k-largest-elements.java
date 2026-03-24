class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        int cnt=0;
        for(int i=arr.length-1;i>=0;i--){
          if(cnt<k){
              list.add(arr[i]);
              cnt++;
          }
          else {
             return list;
             
          }
        }
        return list;
    }
}
