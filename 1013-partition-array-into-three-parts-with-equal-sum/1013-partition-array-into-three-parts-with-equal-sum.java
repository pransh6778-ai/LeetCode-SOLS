class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int totalSum=0;
        int count=0;
        for(int num: arr){
            totalSum+=num;
        }
        int reqSum=totalSum/3;
        int currSum=0;
        if(totalSum%3!=0){
            return false;
        }
        for(int num: arr){
            currSum+=num;
            if(currSum==reqSum){
                count++;
                currSum=0;
            }
        }
        return count>=3;
    }
}