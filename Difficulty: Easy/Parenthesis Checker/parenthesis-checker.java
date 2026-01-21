class Solution {
    public boolean isBalanced(String s) {
        // code here
       
        int n=s.length();
        Stack<Character> stk=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(ch=='[' || ch=='(' || ch=='{'){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                char top=stk.pop();
                if((ch==')' && top!='(') || 
                    (ch=='}' && top!='{') ||
                    (ch==']' && top!='[')){
                        return false;
                    }
            }
        }
        return stk.isEmpty();
    }
}
