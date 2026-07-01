class Solution {
	void nextPermutation(int[] arr) {
		// code here
		int n = arr.length;
	
		
		int pivot = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i]<arr[i + 1]) {
				pivot = i;
				break;
			}
			
		}
		
		if (pivot == -1) {
			reverse(arr, 0, n - 1);
			return;
		}
		
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i]>arr[pivot]) {
				swap(arr, i, pivot);
				break;
			
			}
		}
		
		reverse(arr,pivot+1,n-1);
	}
	
	public void swap(int []arr, int left, int right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		
	}
	
	public void reverse(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
