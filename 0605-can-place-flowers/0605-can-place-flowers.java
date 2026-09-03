class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k=flowerbed.length;
        for(int i=0; i<k; i++){
            boolean pre=i==0 || flowerbed[i-1]==0;
            boolean post=i==k-1 || flowerbed[i+1]==0;
            if(pre && post && flowerbed[i]==0){
                flowerbed[i]=1;
                n--;
            }
            
        }
        return n<=0;
    }
}