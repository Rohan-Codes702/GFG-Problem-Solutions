// User function Template for Java

class Solution {
    public String reverse(String str) {
        // complete the function here
        int n=str.length();
        char arr[]=str.toCharArray();
        
        int i=0;
        int j=arr.length -1;
        
        while(i<j){
            if(!Character.isLetter(arr[i])){
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                j--;
                
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        
        return new String(arr);
        
        
    }
}