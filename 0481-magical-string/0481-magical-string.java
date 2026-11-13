class Solution {
    public int magicalString(int n) {
        StringBuilder sb= new StringBuilder();
        sb.append("122");
        int i=2;
        char next='1';
        for(int j=2; sb.length()<=n; j++){
            int occurance=sb.charAt(i)-'0';
            for(int k=0; k<occurance; k++){
                sb.append(next);
            }
            if(next=='1'){
                next='2';
            }else{
                next='1';
            }
            i++;
        }
        int count1=0;
        for(int p=0; p<n; p++){
            if(sb.charAt(p)=='1') count1++;
        }
        return count1;
    }
}