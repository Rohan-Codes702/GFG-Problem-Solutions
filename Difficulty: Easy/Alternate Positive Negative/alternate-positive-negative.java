class Solution {
	void rearrange(ArrayList<Integer> arr) {
		// code here
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		
		for (int i = 0; i<arr.size(); i++) {
			if (arr.get(i) >= 0) {
				l1.add(arr.get(i));
			}
			else {
				l2.add(arr.get(i));
			}
		}
		arr.clear();
		int i = 0;
		
		while (i<l1.size() && i<l2.size()) {
			arr.add(l1.get(i));
			arr.add(l2.get(i));
			i++;
		}
		
		while (i<l1.size()) {
			arr.add(l1.get(i));
			i++;
		}
		
		while (i<l2.size()) {
			arr.add(l2.get(i));
			
			i++;
		}
		
	}
}
