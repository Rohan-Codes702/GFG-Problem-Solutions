// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>>list1=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==0){
                ArrayList<Integer>list=new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);
                
                list1.add(list);
                i++;
                j--;
                
            while (i < j && arr[i] == arr[i-1]) i++;
            while (i < j && arr[j] == arr[j+1]) j--;

            } 
            else if (sum < 0) {
                i++;
            } 
            else {
                j--;
            }
            
           

        }
        
        
        return list1;
        
    }
}
