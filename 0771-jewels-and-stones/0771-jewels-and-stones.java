class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        char[] jew=jewels.toCharArray();
        for(char c: jew){
            set.add(c);
        }
        char[] sto=stones.toCharArray();
        int count=0;
        for(char c: sto){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}