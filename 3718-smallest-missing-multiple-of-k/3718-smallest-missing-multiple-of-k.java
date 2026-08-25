class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        if(n<2){
            if(nums[0]==k){
                return 2*k;
            }
        }
        for(int i=1; i<n; i++){
            if(!set.contains(k*i))
            return k*i;
        }
        return k*n;
    }
}