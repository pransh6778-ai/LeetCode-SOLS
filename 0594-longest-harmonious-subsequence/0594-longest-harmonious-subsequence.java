class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0; right<nums.length; right++){
            if(map.containsKey(nums[right])){
                map.put(nums[right], map.get(nums[right])+1);
            }else{
                map.put(nums[right], 1);
            }
        }
        for(int num: map.keySet()){
            if(map.containsKey(num+1)){
                count=Math.max(count, map.get(num)+map.get(num+1));
            }
        }
        return count;
    }
}