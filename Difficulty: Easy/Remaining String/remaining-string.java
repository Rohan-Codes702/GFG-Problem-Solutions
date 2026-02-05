class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int m=s.length();
        
        int cnt=count;
        
       StringBuilder str=new StringBuilder();
        
        for(int i=0;i<m;i++){
            char chr=s.charAt(i);
            
            if(chr==ch){
                cnt--;
                if (cnt == 0) continue;
            }
            if(cnt<=0){
                str.append(chr);
            }
        }
        return str.toString();
    }
}