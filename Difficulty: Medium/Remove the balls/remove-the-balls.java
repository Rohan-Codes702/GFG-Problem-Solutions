class Solution {
	public int findLength(int[] color, int[] radius) {
		// code here
		int n = color.length;
		int m = radius.length;
		Stack<Integer>stk1 = new Stack<>();
		Stack<Integer>stk2 = new Stack<>();
		stk1.push(color[0]);
		stk2.push(radius[0]);
		for (int i = 1; i<n; i++) {
			if (stk1.isEmpty() || stk1.peek() != color[i] || stk2.peek() != radius[i]) {
				stk1.push(color[i]);
				stk2.push(radius[i]);
			}
			else {
				stk1.pop();
				stk2.pop();
			}
			
		}
		return stk1.size();
		
	}
}
