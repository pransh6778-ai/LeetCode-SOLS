class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int findex=-1;
        int lindex=-1;
    
        int left=0; 
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                if(mid==0){
                    findex=0;
                    break;
                }
                if(nums[mid-1]==target){
                    right=mid-1;
                }
            else{findex=mid;
                break;}}
            else if(nums[mid]>target){
                right=mid-1;
            }else {
                left= mid+1;
            }}
        left=0;
        right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                if(mid==n-1){
                    lindex=mid;
                    break;
                }
                if(nums[mid+1]==target){
                    left=mid+1;
                }
                
            else{lindex=mid;
                break;}
            }
            else if(nums[mid]>target){
                right=mid-1;
            }else {
                left= mid+1;
            }
            }
        
        return new int[]{findex,lindex};
    }
}