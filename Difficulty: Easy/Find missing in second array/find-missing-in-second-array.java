// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        {
            ArrayList<Integer>list=new ArrayList<>();
            HashSet<Integer>set=new HashSet<>() ;
            
            for(int i=0;i<b.length;i++){
                set.add(b[i]);
            }
            
            for(int i=0;i<a.length;i++){
                if(!set.contains(a[i])){
                    list.add(a[i]);
                }
            }
            return list;
        }
    }
}
