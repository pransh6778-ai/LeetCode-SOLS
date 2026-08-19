class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] result=new int[Math.max(nums1.length, nums2.length)];
        int k=0;
        for(int num:nums1){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        for(int num: nums2){
            if(map.containsKey(num) && map.get(num)>0){
                result[k]=num;
                k++;
                map.put(num, map.get(num)-1);
            }
        }
        return Arrays.copyOf(result, k);
    }
}