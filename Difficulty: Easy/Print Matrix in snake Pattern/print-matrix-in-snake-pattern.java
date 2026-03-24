// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        int n=matrix.length;
        ArrayList<Integer> list=new ArrayList<>();
        int rows=matrix.length;
        
        for(int i=0;i<rows;i++){
            if(i%2==0){
                for(int j=0;j<matrix[0].length;j++){
                    list.add(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix[0].length-1;j>=0;j--){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}