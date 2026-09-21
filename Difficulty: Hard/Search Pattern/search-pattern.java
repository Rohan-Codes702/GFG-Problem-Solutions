class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
    
        
        int idx=txt.indexOf(pat);
        
        while(idx!=-1){
            ans.add(idx);
            
            idx=txt.indexOf(pat,idx+1);
        }
        return ans;
    }
}