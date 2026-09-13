class Solution {
    public int minCostToMoveChips(int[] position) {
        int n= position.length;
        int evenChips=0;
        int oddChips=0;
        for(int i=0; i<n; i++){
            if(position[i]%2==0){
                evenChips++;
            }else{
                oddChips++;
            }
        }
        return Math.min(evenChips, oddChips);
    }
}