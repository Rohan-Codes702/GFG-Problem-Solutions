class Solution {
    public int countWords(String s) {
        // code here
        int count=0;
        
        boolean isvalid=false;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch>='a' & ch<='z'){
                if(!isvalid){
                    count++;
                    isvalid=true;
                }
            }
            else{
                isvalid=false;
            }
        }
        return count;
    }
}