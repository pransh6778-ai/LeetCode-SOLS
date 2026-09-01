class Solution {
    public int longestPalindrome(String s) {
        char[] freq= new char[256];
        for(char c: s.toCharArray()){
            freq[c]++;
        }
        int length=0;
        boolean odd= true;
        for(int f: freq){
            if(f%2==0){
                length+=f;
            }else if(f>2){
                length+=f-1;
                odd=false;
            }else{
                odd=false;
            }
        }
        if(!odd){
            return length+1;
        }
        return length;
    }
}