class SpecialStack {
	Stack <Integer>stk;
	public SpecialStack() {
		// Define Stack
		stk = new Stack();
	}
	
	public void push(int x) {
		// Add an element to the top of Stack
		
		stk.push(x);
		
	}
	
	public void pop() {
		// Remove the top element from the Stack
		if (!stk.isEmpty()) {
			stk.pop();
		}
	}
	
	public int peek() {
		// Returns top element of the Stack
		if (!stk.isEmpty()) {
			return stk.peek();
		}
		return - 1;
	}
	
	boolean isEmpty() {
		// Check if the stack is empty
		
		return stk.isEmpty();
	}
	
	public int getMax() {
		// Finds maximum element of Stack
		int max = Integer.MIN_VALUE;
		if (stk.isEmpty()) {
			return - 1;
		}
		
		for (int i = 0; i<stk.size(); i++) {
			max = Math.max(max, stk.get(i));
		}
		return max;
	}
}
