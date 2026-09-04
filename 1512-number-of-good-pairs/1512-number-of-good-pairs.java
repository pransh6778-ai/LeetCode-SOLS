class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n= nums.length;
        int goodPairs=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(int x: map.keySet()){
            if(map.get(x)>1){
                int p=map.get(x);
                goodPairs+=(p*(p-1))/2;
            }
        }
        return goodPairs;
    }
}