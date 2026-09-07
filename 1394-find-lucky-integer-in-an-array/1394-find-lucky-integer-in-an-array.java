class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int luckyMax=-1;
        for(int x: map.keySet()){
            if(x==map.get(x)){
                luckyMax=x;
            }
        }
        return luckyMax;
    }
}