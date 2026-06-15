// User function Template for Java

class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        // code here
       while(!st.isEmpty()){
           cloned.push(st.pop());
       }
       Collections.reverse(cloned);
    }
}