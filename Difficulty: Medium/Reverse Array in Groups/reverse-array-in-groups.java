class Solution {
	public void reverseInGroups(int[] arr, int k) {
		// code here
		int n = arr.length;
		int []res = new int[n];
		int p = 0;
		
		ArrayList<Integer>list = new ArrayList<>();
		int s = 0;
		for (int i = 0; i<n; i++) {
			if (s <k) {
				list.add(arr[i]);
				s++;
			}
			else {
				Collections.reverse(list);
				
				for (int j = 0; j<list.size(); j++) {
					res[p++] = list.get(j);
				}
				list.clear();
				list.add(arr[i]);
				s = 1;
			}
		}
		Collections.reverse(list);
		// Missing part
		for (int j = 0; j < list.size(); j++) {
			res[p++] = list.get(j);
		}
		
		for (int i = 0; i<res.length; i++) {
			arr[i] = res[i];
		}
	}
}
