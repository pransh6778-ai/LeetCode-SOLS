class Solution {
    public int missingInteger(int[] nums) {
        int n= nums.length;
        int[] prefix= new int[n];
        prefix[0]=nums[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int index=0;
        for(int i=0; i<n-1 ; i++){
            if(nums[i]+1==nums[i+1]){
                index=i+1;}
                else{break;}
            }
        
        int sum=prefix[index];
        while(true){
            boolean res=false;
            for(int i=0; i<n; i++){
                if(nums[i]==sum){
                    res=true;
                    break;
                }
            }
            if(!res){
                return sum;
            }
            sum++;
        }
    }
}