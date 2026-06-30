class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        //int col=matrix[0].length;       // n*n matrix so could be done using n also 
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1) c++;
            }
            arr.add(c);
        }
        int[] resultArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            resultArray[i] = arr.get(i);
        }
        return resultArray;
    }
}