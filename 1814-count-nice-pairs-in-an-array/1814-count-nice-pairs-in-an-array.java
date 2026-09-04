class Solution {
    public int countNicePairs(int[] nums) {
        long nice=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int x: nums){
            int diff=x-rev(x);
            map.put(diff, map.getOrDefault(diff, 0)+1);
        }
        for(int d: map.keySet()){
            long count=map.get(d);
            nice+= ((count*(count-1))/2)%(long)(Math.pow(10,9)+7);
            nice%=Math.pow(10,9)+7;
        }
        return (int)nice;
    }
    public int rev(int a){
        int reverse=0;
        while(a!=0){
            int rem=a%10;
            reverse=reverse*10+rem;
            a/=10;
        }
        return reverse;
    }
}