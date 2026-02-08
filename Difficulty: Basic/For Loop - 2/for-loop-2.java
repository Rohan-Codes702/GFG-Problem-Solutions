class Solution {
    public static void utility(String s) {
        // code here
        StringBuilder str=new StringBuilder();
        
        for(int i=0;i<s.length();i+=2){
            str.append(s.charAt(i));
        }
       System.out.print(str.toString());
    }
}