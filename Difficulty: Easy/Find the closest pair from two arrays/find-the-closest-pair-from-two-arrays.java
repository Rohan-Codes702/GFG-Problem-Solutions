class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        ArrayList<Integer>list =new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        
        int i=0;
        int j=n2-1;
        
        int mindiff=Integer.MAX_VALUE;
        while(i<n1 && j>=0){
            int sum=arr1[i]+arr2[j];
            
            int diff=Math.abs(x-sum);
            
            if(diff<mindiff){
                mindiff=diff;
                list.clear();
                list.add(arr1[i]);
                list.add(arr2[j]);
            }
            
            if(sum>x){
                j--;
            }
            else{
                i++;
            }
        }
        return list;
    }
}