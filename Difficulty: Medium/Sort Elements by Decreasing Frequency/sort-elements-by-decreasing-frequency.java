// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            list.add((arr[i]));
        }
        
        Collections.sort(list,(a,b)->{
            if(map.get(a).equals (map.get(b))){
                return a-b;
            }
            else{
                return map.get(b)-map.get(a);
            }
            
        });
        return list;
        
        
    }
}