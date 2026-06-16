// User function Template for Java
class Solution {
	String transform(String S) {
		// code here
		int n = S.length();
		String st = S.toLowerCase();
		StringBuilder str = new StringBuilder();
		
		Stack<Character>stk = new Stack<>();
		
		for (int i = 0; i<n; i++) {
			char ch = st.charAt(i);
			
			if (stk.isEmpty() || stk.peek() == ch) {
				stk.push(ch);
			}
			
			else {
				str.append(stk.size());
				str.append(stk.peek());
				while (!stk.isEmpty()) {
					stk.pop();
				}
				stk.push(ch);
			}
			
		}
		if (!stk.isEmpty()) {
			str.append(stk.size());
			str.append(stk.peek());
			
		}
		
		return str.toString();
	}
}
