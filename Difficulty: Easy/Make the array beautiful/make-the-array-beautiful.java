class Solution {
	List<Integer> makeBeautiful(int[] arr) {
		// code here
		List<Integer>list = new ArrayList<>();
		int n = arr.length;
		Stack<Integer>stk = new Stack<>();
		for (int i = 0; i<n; i++) {
			
			if (!stk.isEmpty() && ((arr[i] >= 0 && stk.peek() < 0) ||
                (arr[i] < 0 && stk.peek() >= 0))) {
				stk.pop();
			}
			else{
			   stk.push(arr[i]);
			}
			
		}
		list.addAll(stk);
		return list;
		
	}
}
