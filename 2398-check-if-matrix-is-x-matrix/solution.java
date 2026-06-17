class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if((i==j && grid[i][j]==0) || (j==grid.length-i-1 && grid[i][j]==0) )  return false;
                if((i!=j && grid[i][j]!=0) && (j!=grid.length-i-1 && grid[i][j]!=0) )  return false;
            }
        }
        return  true;
    }
}
