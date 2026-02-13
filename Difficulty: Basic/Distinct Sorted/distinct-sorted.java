// User function Template for Java

class Solution {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        HashMap<Integer,Integer>map=new HashMap<>();
       
       for(int i:arr){
           map.put(i,map.getOrDefault(i,0)+1);
       }
       
       for(int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
               list.add(arr[i]);
               map.remove(arr[i]);
           }
          
       }
       return list;
    }
}