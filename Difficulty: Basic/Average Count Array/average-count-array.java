// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public ArrayList<Integer> countArray(int[] arr, int x) {
        // Complete the function
         ArrayList<Integer>list=new ArrayList<>();
         
         HashMap<Integer,Integer>map=new HashMap<>();
         
         for(int i:arr){
             map.put(i,map.getOrDefault(i,0)+1);
         }
         
         for(int i=0;i<arr.length;i++){
            int res = (arr[i] + x) / 2;             
             if(map.containsKey(res)){
                 list.add(map.get(res));
             }
             else{
                 list.add(0);
             }
         }
         return list;
         
    }
}
