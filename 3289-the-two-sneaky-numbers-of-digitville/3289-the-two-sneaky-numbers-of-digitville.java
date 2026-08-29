class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n= nums.length;
        HashSet<Integer> set= new HashSet<>();
        int[] res= new int[2];
        int k=0;
        for(int num: nums){
            if(set.contains(num)){
                res[k]=num;
                k++;
            }else{
                set.add(num);
            }
        }
        return res;
    }
}