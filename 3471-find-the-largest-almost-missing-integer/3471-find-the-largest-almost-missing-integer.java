class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<=n-k; i++){
            HashSet<Integer> set= new HashSet<>();
            for(int j=i; j<i+k; j++){
                set.add(nums[j]);
            }
            for(int x: set){
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }else{
                    map.put(x, 1);
                }
            }
        }
        int maxres=-1;
        for(int x: map.keySet()){
            if(map.get(x)==1){
                maxres=Math.max(maxres, x);
            }
        }
        return maxres;
    }
}