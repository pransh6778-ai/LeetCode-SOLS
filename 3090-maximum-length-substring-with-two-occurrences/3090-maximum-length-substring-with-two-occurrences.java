class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int l=0;
        int maxlen=0;
        for(int r=0; r<s.length(); r++){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            while(map.get(ch)>2){
                char left=s.charAt(l);
                map.put(left, map.get(left)-1);
                l++;
            }
            
            maxlen=Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}