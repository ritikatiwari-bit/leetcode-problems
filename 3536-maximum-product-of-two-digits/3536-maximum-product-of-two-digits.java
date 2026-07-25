class Solution {
    public int maxProduct(int n) {

        if (n < 10) return 0; // Handle single-digit edge case
    
        int max1 = 0, max2 = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
            n = n / 10;
        }
        return max1 * max2;

        // ArrayList<Integer> p=new ArrayList<>();
        // int d1=n%10,d2;
        // n=n/10;
        // while(n>0){
        //     d2=n%10;
        //     p.add(d1*d2);
        //     d1=d2;
        //     n=n/10;
        // }
        // return Collections.max(p);
    }
}