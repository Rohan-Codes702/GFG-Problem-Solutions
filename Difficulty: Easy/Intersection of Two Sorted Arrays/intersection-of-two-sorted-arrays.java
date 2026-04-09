class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
         ArrayList<Integer>list=new ArrayList<>();
         
         HashSet<Integer>set1=new HashSet<>();
         HashSet<Integer>set2=new HashSet<>();
         
         for(int i:b){
             set1.add(i);
         }
         
            for(int i:a){
             set2.add(i);
         }
        ArrayList<Integer>list2=new ArrayList<>(set1);
        
        for(int i=0;i<list2.size();i++){
            if(set2.contains(list2.get(i))){
                list.add(list2.get(i));
            }
        }
        Collections.sort(list);
        

         
         
        
         
         return list;
    }
}