// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        int n=s.length();
        int maxLen=0;
        int left=0;
        HashSet<Character>set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}