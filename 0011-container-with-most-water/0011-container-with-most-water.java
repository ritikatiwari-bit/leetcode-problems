class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int i=0,j=n-1;
            //o(n)   2 pointer
        while(i<=j){
            max=Math.max(max, Math.min(height[i],height[j]) * (j-i));

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;



                //o(n^2)
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int area =Math.min(height[i],height[j]) * (j-i);
        //         if(area > max){
        //             max=area;
        //         }
        //     }
        // }
        // return max;
    }
}