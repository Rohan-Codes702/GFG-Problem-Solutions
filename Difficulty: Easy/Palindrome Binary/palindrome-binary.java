class Solution {
    public boolean isBinaryPalindrome(int n) {
        // code here
        String str=Integer.toBinaryString(n);
        
       // char ch[]=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
            
    }
};