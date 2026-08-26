class Solution {
    public int surfaceArea(int[][] grid) {
        int n=grid.length;
        int area=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]>0){
                    area+=2;
                }
            }
        }
        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    area+=grid[i][j];
                }else {
                    area+=Math.max(0, Math.abs(grid[i][j]-grid[i][j-1]));
                }
                if(j==n-1){
                    area+=grid[i][j];
                }
            }
        }
        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0){
                    area+=grid[i][j];
                }else{
                    area+=Math.max(0, Math.abs(grid[i][j]-grid[i-1][j]));
                }
                if(i==n-1){
                    area+=grid[i][j];
                }
            }
        }
        return area;
    }
}