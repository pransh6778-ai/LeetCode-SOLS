class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] res= new int[n+1];
        int min=0;
        int max=n;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='I'){
                res[i]=min;
                min++;
            }else if(s.charAt(i)=='D'){
                res[i]=max;
                max--;
            }
        }
        res[n]=min;
        return res;
    }
}