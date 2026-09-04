class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        int n= rectangles.length;
        long possChanges=0;
        HashMap<Double, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            double ratio=(double)rectangles[i][0]/rectangles[i][1];
            map.put(ratio, map.getOrDefault(ratio,0)+1);
        }
        for(double x: map.keySet()){
            if(map.get(x)>1){
                long count= map.get(x);
                possChanges+= (count*(count-1))/2;
            }
        }
        return possChanges;
    }
}