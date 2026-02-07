// User function Template for Java

class Solution {
    public static int unique_substring(String s) {
        // Your code here
        int count=0;
        char ch[]=s.toCharArray();
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<=ch.length;j++){
               set.add(s.substring(i,j));
            }
        }
        return set.size();
    }
}