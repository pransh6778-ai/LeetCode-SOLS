class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
        int count=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==arr2[i]){
                count++;            }
        }
        if(count==arr1.length){
            return true;
        }else{
            return false;
        }
    }
}