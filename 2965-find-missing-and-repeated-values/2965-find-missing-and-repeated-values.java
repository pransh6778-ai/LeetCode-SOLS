class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                int num=grid[i][j];
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        int rep=-1;
        int miss=-1;
        for(int i=1; i<=n*n; i++){
            if(map.getOrDefault(i,0)==2){
                rep=i;
            }
        }
        for(int i=1; i<=n*n; i++){
            if(map.getOrDefault(i,0)==0){
                miss=i;
            }
        }
        return new int[]{rep,miss};
    }
}