class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int n=mat.length;
       HashSet<Integer>row=new HashSet<>();
        HashSet<Integer>col=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++){
                if(row.contains(i) || col.contains(j)){
                    mat[i][j]=0;
                }
            }
        }
    }
}