class Solution {
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<n;i++){
            int paper=n-i;
            
            if(citations[i]>=paper){
                return paper;
            }
            
        }
        return 0;
    }
}