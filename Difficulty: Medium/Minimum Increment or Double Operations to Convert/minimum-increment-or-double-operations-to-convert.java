class Solution {
	public int countMinOperations(int arr[]) {
		// code here
		int n = arr.length;
		
		int count = 0;
		
		while (true) {
			boolean allzero = true;
			
			for (int i = 0; i<n; i++) {
				if (arr[i] != 0) {
					allzero = false;
					break;
				}
			}
			
			if (allzero) {
				return count;
			}
			
			boolean oddfound = false;
			
			for (int i = 0; i<n; i++) {
				if (arr[i]%2 == 1) {
					arr[i]--;
					count++;
					oddfound = true;
				}
				
			}
			if (!oddfound) {
				for (int i = 0; i<n; i++) {
					if (arr[i]%2 == 0) {
						arr[i] = arr[i]/2;
					}
					
				}
				count++;
			}
			
		}
	}
}
