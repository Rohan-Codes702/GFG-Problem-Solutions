// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
        int n=arr.length;
        
        HashMap<String,Integer>map=new HashMap<>();
        
        for(String i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        String winner="";
        int maxvote=0;
        
        for(int i=0;i<n;i++){
            String candidate=arr[i];
            int votes=map.get(candidate);
            
            if(votes>maxvote){
                winner=candidate;
                maxvote=votes;
            }
            else if(maxvote==votes){
                if(winner.equals("")||candidate.compareTo(winner)<0){
                    winner=candidate;
                }
            }
        }
        return winner;
    }
}