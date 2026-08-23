class Solution {
    public int projectionArea(int[][] grid) {
        int n=grid.length;
        int area=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]>0)
                area++;
            }
        }
        for(int i=0; i<n; i++){
            int r=0;
            for(int j=0; j<n; j++){
                r=Math.max(r, grid[i][j]);
            }
            area+=r;
        }
        for(int i=0; i<n; i++){
            int c=0;
            for(int j=0; j<n; j++){
                c=Math.max(c, grid[j][i]);
            }
            area+=c;
        }
        return area;
    }
}