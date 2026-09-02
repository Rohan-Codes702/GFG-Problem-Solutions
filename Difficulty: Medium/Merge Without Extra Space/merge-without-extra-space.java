class Solution {
	public void mergeArrays(int a[], int b[]) {
		// code here
		int n = a.length;
		int m = b.length;
		
		int i = n - 1;
		int j = 0;
		
		while (i >= 0 && j<m) {
			
			if (a[i]>b[j]) {
				int t = a[i];
				a[i] = b[j];
				b[j] = t;
				i--;
				
			}
			else {
				j++;
			}
			
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
	}
}
