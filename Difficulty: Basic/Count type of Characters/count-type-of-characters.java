// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
        int[]res=new int[4];
        int lower=0;
        int upper=0;
        int num=0;
        int sp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else if(Character.isLowerCase(ch)){
                lower++;
            }
            else if(Character.isDigit(ch))
            {
                num++;
            }
            else{
                sp++;
            }
        }
        res[0]=upper;
        res[1]=lower;
        res[2]=num;
        res[3]=sp;
        
        return res;
    }
}