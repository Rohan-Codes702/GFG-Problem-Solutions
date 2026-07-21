class Solution {
	public String sortedDistinct(String s) {
		// code here
		HashSet<Character>set = new HashSet<>();
		
		for (char ch:s.toCharArray()) {
			set.add(ch);
		}
		char []ch = new char[set.size()];
		int i = 0;
		for (char c:set) {
			ch[i++] = c;
		}
		Arrays.sort(ch);
		
		StringBuilder sb = new StringBuilder();
		
		for (char c:ch) {
			sb.append(c);
		}
		return sb.toString();
		
	}
}
