class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        List<Integer> ans= new LinkedList<>();
        for (int i = 0; i < n-1; i++) {
            int curr = nums[i];
            int next = nums[i + 1];

            while (curr + 1 < next) {
                ans.add(curr + 1);
                curr++;
            }
        }
        return ans;
    }
}