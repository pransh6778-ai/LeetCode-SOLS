class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int product=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        if(org%(sum+product)==0){
            return true;
        }else{
            return false;
        }
    }
}