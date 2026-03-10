import java.util.*;

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> list = new ArrayList<>();
         
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
          
        for(int i = 0; i < arr1.size(); i++){
            set1.add(arr1.get(i));
        }
          
        for(int i = 0; i < arr2.size(); i++){
            set2.add(arr2.get(i));
        }
        
        for(int i = 0; i < arr3.size(); i++){
            if(set1.contains(arr3.get(i)) && set2.contains(arr3.get(i)) 
               && !list.contains(arr3.get(i))){
                list.add(arr3.get(i));
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        
        return list;
    }
}