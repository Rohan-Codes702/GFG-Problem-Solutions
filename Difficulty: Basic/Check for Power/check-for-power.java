class Solution {
    public boolean isPower(int x, int y) {
        // Base cases
        if (x == 1) return y == 1;
        if (y == 1) return true;
        
        long val = x; // Use long to prevent potential overflow
        while (val < y) {
            val *= x;
        }
        
        return val == y;
    }
}