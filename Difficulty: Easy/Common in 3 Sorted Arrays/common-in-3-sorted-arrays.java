class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
         ArrayList<Integer>list=new ArrayList<>();
         HashSet<Integer>bset=new HashSet<>();
          HashSet<Integer>cset=new HashSet<>();
        HashSet<Integer>added=new HashSet<>();

          
          for(int i:b){
              bset.add(i);
              
          }
         for(int i:c){
             cset.add(i);
         }
         
         for(int i=0;i<a.length;i++){
             if(bset.contains(a[i])&& cset.contains(a[i]) && !added.contains(a[i])){
                 list.add(a[i]);
                 added.add(a[i]);
             }
         }
         return list;
    }
}