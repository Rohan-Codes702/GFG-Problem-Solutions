class Solution {
    public static int countDigits(int n) {
        // Code here
      String str=Integer.toString(n);
      
      if(str.charAt(0)=='-'){
          return str.length()-1;
      }
      
      return str.length();
    }
}
