class Solution {
public:
    int clumsy(int n) {
        
        if (n == 1) return 1;
        if (n == 2) return 2; 
        if (n == 3) return 6; 
        
       
        int fac = n * (n - 1) / (n - 2) + (n - 3);
        n -= 4;
        
        
        while (n >= 4) {
          
            fac = fac - n * (n - 1) / (n - 2) + (n - 3);
            n -= 4;
        }
        
         if (n == 3) {
            fac -= 3 * 2 / 1; 
        } else if (n == 2) {
            fac -= 2 * 1;
        } else if (n == 1) {
            fac -= 1;
        }
        
        return fac;
    }
};