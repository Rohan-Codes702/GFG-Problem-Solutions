class Solution {
    public int countDistinct(List<Integer> arr) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        
        for(int i:arr){
            set.add(i);
        }
        
        return set.size();
       
    }
}