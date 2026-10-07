class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int pens=total/cost1;
        int pencils=total/cost2;
        long count=0;
        int penways=0;
        int pclways=0;
        if(cost1>cost2){
            int iniways=(total/cost2)+1;
            while(penways<=pens){
            count+=iniways;
            penways++;
            if(penways<=pens){
            iniways=(total-(penways*cost1))/cost2+1;}
        }}else{
            int iniways2=(total/cost1+1);
            while(pclways<=pencils){  
                count+=iniways2;
                pclways++;
                if(pclways<=pencils){
                iniways2=(total-(pclways*cost2))/cost1+1;}
            }
        }
        return count;
    }
}