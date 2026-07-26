class Solution {
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       
       int levelsize=1;
       int i=0;
       while( i<arr.length){
           ArrayList<Integer>list=new ArrayList<>();
           
           for(int j=0; j<levelsize&& i<arr.length;j++){
               list.add(arr[i]);
               i++;
           }
           Collections.sort(list);
           ans.add(list);
           levelsize=levelsize*2;
       }
       return ans;
    }
}