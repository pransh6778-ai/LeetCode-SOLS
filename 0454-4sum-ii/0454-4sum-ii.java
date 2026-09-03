class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map =new HashMap<>();
        int tupCount=0;
        for(int x: nums1){
            for(int y: nums2){
                int sum=x+y;
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }
        for(int p: nums3){
            for(int q: nums4){
                int sum=p+q;
                tupCount+=map.getOrDefault(-sum, 0);
            }
        }
        return tupCount;
    }
}