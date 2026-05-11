// User function Template for Java

class Solution {
	public static String electionWinner(String arr[]) {
		// Your code here
		int n = arr.length;
		HashMap<String, Integer>map = new HashMap<>();
		
		for (String str:arr) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		 String str="";
		int maxfreq=0;
		for(String key:map.keySet()){
		    if(map.get(key)>maxfreq){
		        maxfreq=map.get(key);
		        str=key;
		    }
		}
		
		return str;
		
	}
}
