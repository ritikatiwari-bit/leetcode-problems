class Solution {
    public int addDigits(int num) {
        int d,sm,n=num;
        do{ 
            sm=0;
            while(n>0){
                d=n%10;
                sm+=d;
                n=n/10;
            }
            n=sm;
        }while(n>9);
        
        return sm;
    }
}