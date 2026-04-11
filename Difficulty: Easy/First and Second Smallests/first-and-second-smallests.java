class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(arr);
        
        int min = arr[0];
        int secondMin = -1;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > min){
                secondMin = arr[i];
                break;
            }
        }
        
        if(secondMin == -1){
          list.add(-1);
        }
        else{
            list.add(min);
            list.add(secondMin);
        }
        
        return list;
    }
}