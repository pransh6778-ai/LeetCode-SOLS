class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for( char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int length=0;
        boolean odd= true;
        for(int f: map.values()){
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