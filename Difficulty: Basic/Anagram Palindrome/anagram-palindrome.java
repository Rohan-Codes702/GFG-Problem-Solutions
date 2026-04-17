class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int n=s.length();
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
         char ch=s.charAt(i);
         
         map.put(ch,map.getOrDefault(ch,0)+1);
         
        }
        int cntodd=0;
        for(char i:map.keySet()){
            if(map.get(i)%2!=0){
                
                cntodd++;
            }
        }
        
        if(n%2==0){
            return cntodd==0;
        }
        else{
            return cntodd==1;
        }
        
        
    }
}