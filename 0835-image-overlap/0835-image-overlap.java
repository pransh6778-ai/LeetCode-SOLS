class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int[] posImgIn1= new int[n*n];
        int[] posImgIn2= new int[n*n];
        int s1=0;
        int s2=0;
        int res=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(img1[i][j]==1){
                    posImgIn1[s1++]=n*i+j;
                }
                if(img2[i][j]==1){
                    posImgIn2[s2++]=n*i+j;
                }
            }
        }
        int size=2*n;
        int[][] overlap=new int[size][size];
        for(int i=0; i<s1; i++){
            int row=posImgIn1[i]/n;
            int col=posImgIn1[i]%n;
            for(int j=0; j<s2; j++){
                int row2=posImgIn2[j]/n;
                int col2=posImgIn2[j]%n;
                int distr=row2-row+n-1;
                int distc=col2-col+n-1;
                overlap[distr][distc]++;
                res=Math.max(res, overlap[distr][distc]);
            }
        }
        return res;
    }
}