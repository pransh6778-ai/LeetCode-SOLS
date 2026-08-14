class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=piles[0];

        for(int i=0; i<n; i++){
            if(max<piles[i]){
                max=piles[i];
            }   
        }
        int left=01; int right=max; int res=0;
        res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long hours=0;
            for(int i=0; i<n; i++){
                hours+=Math.ceil((double)piles[i]/mid);
                
            }
            if(hours<=h){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
}