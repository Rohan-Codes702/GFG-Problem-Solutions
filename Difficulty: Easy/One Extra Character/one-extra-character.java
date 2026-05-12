// User function Template for Java
class Solution {
	public static Character oneExtraCharacter(String s1, String s2) {
		// Your code here
		char ch[] = s1.toCharArray();
		char chr[] = s2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(chr);
		
		int n = Math.min(ch.length, chr.length);
		
		for (int i = 0; i<n; i++) {
			if (ch[i] != chr[i]) {
				if (ch.length > chr.length) {
					return ch[i];
				}
				else {
					return chr[i];
				}
			}
		}
		
		if (ch.length > chr.length) {
			return ch[ch.length - 1];
		}
		return chr[chr.length - 1];
		
	}
}
