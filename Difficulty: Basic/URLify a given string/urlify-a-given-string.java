class Solution {
    String URLify(String s) {
        // code here
        int n=s.length();
        StringBuilder str=new StringBuilder();
        String []st=s.split(" ",-1);
        
        for(int i=0;i<st.length;i++){
            str.append(st[i]);
            if(i<st.length-1){
                str.append("%20");
            }
        }
        return str.toString();
    }
}