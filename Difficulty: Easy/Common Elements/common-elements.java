// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
         
         ArrayList<Integer>list=new ArrayList<>();
         
         int n=a.length;
         int m=b.length;
         
        Arrays.sort(a) ;
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            
            else if
            (a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return list;
         
    }
}