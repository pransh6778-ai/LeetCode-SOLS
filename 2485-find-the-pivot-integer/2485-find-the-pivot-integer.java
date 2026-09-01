class Solution {
    public int pivotInteger(int n) {
        int preSum=1;
        int postSum=n;
        int i=1;
        int j=n;
        while(i<j){
            if(preSum<postSum){
                i++;
                preSum+=i;
            }else{
                j--;
                postSum+=j;
            }
        }
        return preSum==postSum? i: -1;
    }
}