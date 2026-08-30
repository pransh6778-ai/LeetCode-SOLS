class Solution {
    public int minimumDeletions(int[] nums) {
        int n= nums.length;
        int min=0; int max=0;
        for(int i=0; i<n; i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        int leDe=Math.min(min, max);
        int riDe=Math.max(min, max);
        return Math.min(riDe+1, Math.min(n-leDe, leDe+1+n-riDe));
    }
}