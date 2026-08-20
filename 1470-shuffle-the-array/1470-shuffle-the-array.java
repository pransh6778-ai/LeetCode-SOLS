class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int k=0;
        for(int i=0; i<nums.length/2; i++){
            res[k]=nums[i];
            k+=2;
        }
        int p=1;
        for(int i=nums.length/2; i<nums.length; i++){
            res[p]=nums[i];
            p+=2;
        }
        return res;
    }
}