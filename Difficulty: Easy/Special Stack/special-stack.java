/*Complete the function(s) below*/
class GfG {
	public void push(int a, Stack<Integer> s) {
		// add code here.
		s.push(a);
	}
	
	public int pop(Stack<Integer> s) {
		// add code here.
		if (!s.isEmpty()) {
			return s.pop();
		}
		return - 1;
	}
	
	public int min(Stack<Integer> s) {
		// add code here.
		int min = Integer.MAX_VALUE;
		for (int i = 0; i<s.size(); i++) {
			if (min>s.get(i)) {
				min = s.get(i);
			}
		}
		return min;
	}
	
	public boolean isFull(Stack<Integer> s, int n) {
	    
		// add code here.
	if(s.size()==n)	{
	    return true;
	}
	return false;
	}
	
	public boolean isEmpty(Stack<Integer> s) {
		// add code here.
		return s.isEmpty();
	}
}
