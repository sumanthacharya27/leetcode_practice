class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int ind=0;
        int[] res= new int[n*n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                res[ind++]=matrix[i][j];
            }
        }
        Arrays.sort(res);
        return res[k-1];
    }
}
