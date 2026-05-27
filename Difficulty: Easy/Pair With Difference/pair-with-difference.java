class Solution {
	public boolean findPair(int[] arr, int x) {
		// code here
		int n = arr.length;
		
		Arrays.sort(arr);
		int i = 0;
		int j = 1;
		while (i<n && j<n) {
			if (i == j) {
				j++;
				continue;
			}
			
			int ans = arr[j]-arr[i];
			if (ans == x) {
				return true;
				
			}
			else if (ans>x) {
				i++;
			}
			else {
				j++;
			}
		}
		
		return false;
	}
}
