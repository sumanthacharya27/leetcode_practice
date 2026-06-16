class Solution {
    public int diagonalSum(int[][] mat) {
        int sSum=0;
        int pSum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j) pSum+=mat[i][j];
                else if(i!=j && j==mat.length-i-1) sSum+=mat[i][j];
            }
        }
        return sSum+pSum;
    }
}
