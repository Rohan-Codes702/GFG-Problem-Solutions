class Solution {
     ArrayList<Integer> sortBySetBitCount(int[] arr) {
        // code here
        int n=arr.length;
        Integer temp[]=new Integer[n];
        
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        
        
Arrays.sort(temp, (a, b) -> Integer.bitCount(b) - Integer.bitCount(a));
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<temp.length;i++){
            list.add(temp[i]);
        }
        return list;
    }
}