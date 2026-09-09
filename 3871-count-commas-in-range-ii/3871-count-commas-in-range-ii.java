class Solution {
    public long countCommas(long n) {
        if(n<=999){
            return 0;
        }else if(n>=1000 && n<=999999){
            return n-999;
        }else if(n>=Math.pow(10,6) && n<=999999999){
            return (n-999999)+(n-999);
        }else if(n>=Math.pow(10,9) && n<=999999999999L){
            return (n-999999)+(n-999)+(n-999999999);
        }else if(n>=Math.pow(10,12) && n<=999999999999999L){
            return (n-999999)+(n-999)+(n-999999999)+(n-999999999999L);
        }else{
            return (n-999999)+(n-999)+(n-999999999)+(n-999999999999L)+(n-999999999999999L);
        }
    }
}