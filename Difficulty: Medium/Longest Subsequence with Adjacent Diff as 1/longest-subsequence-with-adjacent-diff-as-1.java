class Solution {
	public int longestSubseq(int[] arr) {
		// code here
		int n = arr.length;
		HashMap<Integer, Integer>map = new HashMap<>();
		
		int ans = 0;
		for (int i = 0; i<n; i++) {
			int l1 = map.getOrDefault(arr[i]-1, 0);
			int l2 = map.getOrDefault(arr[i]+1, 0);
			
			int current = Math.max(l1, l2) + 1;
			
			map.put(arr[i], current);
			ans = Math.max(ans, current);
		}
		return ans;
		
	}
}
