class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n < m*k){
            return -1;
        }
        int high=bloomDay[0];
        for(int i=0; i<n; i++){
            if(bloomDay[i]>high){
                high=bloomDay[i];
            }
        }
        int low=0;
        int mid=low+(high-low)/2;
        int adjFlo=0;
        int bouForm=0;
        int res=-1;
        while(low <= high){
            adjFlo=0;
            bouForm=0;
            mid=low+(high-low)/2;
            for(int i=0; i<n; i++){
                if(bloomDay[i] <= mid){
                    adjFlo++;
                    if(adjFlo==k){
                    adjFlo=0;
                    bouForm++;
                    if(bouForm==m)
                    {break;}
                }
                }else{
                    adjFlo=0;
                }
            }
            if(bouForm >= m){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}