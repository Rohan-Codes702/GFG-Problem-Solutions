class Solution {
	public void rotateMatrix(int[][] mat) {
		// code here
		int n = mat.length;
		
		for (int i = 0; i<n; i++) {
			for (int j = i + 1; j<mat[0].length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		int left = 0;
		int right = n - 1;
		
		while (left<right) {
			int temp[] = mat[left];
			mat[left] = mat[right];
			mat[right] = temp;
			
			left++;
			right--;
		}
	}
}
