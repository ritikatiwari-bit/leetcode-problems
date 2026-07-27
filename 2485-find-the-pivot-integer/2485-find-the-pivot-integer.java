class Solution {
    public int pivotInteger(int n) {
        int leftSm=0,rtSm=0;
        for(int i=1;i<=n;i++){
            leftSm+=i;
        }

        for(int i=n;i>0;i--){
            leftSm-=i;
            if(leftSm==rtSm){
                return i;
            }
            rtSm+=i;
            //System.out.println(leftSm+" "+rtSm);
        }
        return -1;
    }
}