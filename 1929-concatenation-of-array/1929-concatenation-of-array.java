class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] res=new int[2*n];
        int m=res.length;
        for(int i=0; i<n; i++){
            res[i]=nums[i];
        }
        for(int i=n; i<m; i++){
            res[i]=nums[i-n];
        }
        return res;
    }
}