class Solution {
	public ArrayList<Integer> calculateSpan(int[] arr) {
		// code here
		ArrayList<Integer>list = new ArrayList<>();
		int n = arr.length;
		Stack<Integer>stk = new Stack<>();
		
		for (int i =0; i <n; i++) {
			while (!stk.isEmpty() && arr[stk.peek()]<= arr[i]) {
				stk.pop() ;
			}
			if (stk.isEmpty()) {
				list.add(i+1);
			}
			else {
				list.add(i-stk.peek());
			}
			stk.push(i);
		}
	
		return list;
	}
}
