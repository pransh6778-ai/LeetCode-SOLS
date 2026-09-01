class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int c: s){
            if(count<g.length && c>=g[count]){
                count++;
            }
        }
        return count;
    }
}