class Solution {
    public int gcdOfOddEvenSums(int n) {
        // int keven=n/2;
        // int kodd=(n+1)/2;

        int smeven = n*(n+1);
        int smodd = n * n;

        return gcd(smodd,smeven);
    }
    public int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    } 
}