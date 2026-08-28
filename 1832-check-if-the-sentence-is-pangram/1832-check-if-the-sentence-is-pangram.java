class Solution {
    public boolean checkIfPangram(String sentence) {
       String str="abcdefghijklmnopqrstuvwxyz";
       for(char c: str.toCharArray()){
        if(sentence.indexOf(c)==-1){
            return false;
        }
       }
       return true;
    }
}