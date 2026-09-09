class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> fact=new ArrayList<>();
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                fact.add(i);
            }
        }
        if(fact.size()<k){
            return -1;
        }
        return fact.get(k-1);
    }
}