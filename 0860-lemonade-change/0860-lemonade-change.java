class Solution {
    public boolean lemonadeChange(int[] bills) {
      int cfive=0;
      int cten=0;
      for(int i=0; i<bills.length; i++){
        if(bills[i]==5){
          cfive++;
        }
        else if(bills[i]==10){
          if(cfive==0){
            return false;
          }
          cfive--;
          cten++;
        }
        else if(bills[i]==20){
          if(cten>0 && cfive>0){
            cfive--;
            cten--;
          }
          else if(cfive>=3){
            cfive-=3;
          }
          else{
            return false;
          }
        }
      }
      return true;
    }
}