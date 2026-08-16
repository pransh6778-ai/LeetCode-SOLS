class Solution {
    public boolean canAliceWin(int n) {
        
        int stones=10;
        int rounds=0;
        while(n >= stones){
            n -= stones;
            stones--;
            rounds++;
        }
        if(rounds%2 ==1){
            return true;
        }else{
            return false;
        }
    }
}