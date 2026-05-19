class Solution {
    public static void utility(String s) {
        // code here
     StringBuilder str=new StringBuilder();
      
      for(int i=0;i<s.length();i++){
          char ch =s.charAt(i);
          
          if(i%2==0){
              str.append(ch);
          }
      }
      System.out.print(str.toString());
    }
}