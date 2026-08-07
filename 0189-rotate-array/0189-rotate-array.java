class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k %= n;
        if(n<2){
            return;
        }
        for(int i=0, j=n-1; i<j; i++, j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        for(int i=0, j=k-1; i<j; i++, j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        for(int i=k, j=n-1; i<j; i++, j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}