import java.math.BigInteger;

class Solution {
    public String multiplyStrings(String s1, String s2) {
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        
        BigInteger ans = num1.multiply(num2);
        return ans.toString();
    }
}