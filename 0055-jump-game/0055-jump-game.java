class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length;
        int maxPos=0;
        for(int i=0; i<n; i++){
            if(i>maxPos)return false;//
            int posAfJump=i+nums[i];
            maxPos=Math.max(maxPos, posAfJump);
            if(maxPos >= n-1){
                return true;
            }
        }
        return false;
    }
}