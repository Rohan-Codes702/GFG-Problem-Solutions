class Solution {
	int maxProduct(int[] arr) {
		// code here
		int n = arr.length;
		int max = arr[0];
		int currpr = 1;
		
		for (int i = 0; i<n; i++) {
			currpr *= arr[i];
			
			if (currpr>max) {
				max = currpr;
			}
			
			if (currpr == 0) {
				currpr = 1;
			}
			
		}
		currpr = 1;
		for (int i = n - 1; i >= 0; i--) {
			currpr *= arr[i];
			
			if (currpr>max) {
				max = currpr;
			}
			
			if (currpr == 0) {
				currpr = 1;
			}
			
		}
		return max;
	}
}
