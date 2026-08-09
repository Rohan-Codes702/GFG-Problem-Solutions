class Solution {
	public static boolean checkPangram(String s) {
		// code here
		char []ch = s.toCharArray();
		
		HashSet<Character>set = new HashSet<>();
		
		for (char c:ch) {
			c=Character.toLowerCase(c);
			
			if(c>='a' && c<='z'){
			    set.add(c);
			}
		}
		
		if (set.size() == 26) {
			return true;
		}
		return false;
	}
}
