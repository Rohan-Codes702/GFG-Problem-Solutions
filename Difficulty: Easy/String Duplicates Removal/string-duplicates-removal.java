// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        String str="";
        
        for(char ch:s.toCharArray()){
            if(str.indexOf(ch)==-1){
                str+=ch;
            }
        }
        return str;
    }
}
