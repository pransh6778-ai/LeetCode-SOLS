class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        for(int i=0; i<n; i++){
            totalSum += nums[i];
        }
        int leftSum=0;
        for(int i=0; i<n; i++){
           // int leftSum=0;
            totalSum -= nums[i];
            if(leftSum==totalSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}