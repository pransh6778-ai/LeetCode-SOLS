class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        while(sum!=1){
            sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
            }
            n=sum;
        }
        return (sum==1)? true: false;
    }
}