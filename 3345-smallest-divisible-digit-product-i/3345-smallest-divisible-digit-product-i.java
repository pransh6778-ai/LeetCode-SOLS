class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int org = n;

            while (org > 0) {
                product *= (org % 10);
                org /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}