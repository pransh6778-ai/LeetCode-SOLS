class Solution {
    public boolean uniformArray(int[] nums1) {
        int n= nums1.length;
        int leastOdd=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(nums1[i]%2==1){
                leastOdd=Math.min(nums1[i], leastOdd);
            }
        }
        if(leastOdd==Integer.MAX_VALUE){
            return true;
        }
        for(int i=0;i<n; i++){
            if(nums1[i]%2==0 && nums1[i]<leastOdd){
                return false;
            }
        }
        return true;
    }
}