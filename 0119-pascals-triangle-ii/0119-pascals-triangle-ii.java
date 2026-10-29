class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr=new ArrayList<>();

        List<Integer> fstRow=new ArrayList<>();

        fstRow.add(1);
        arr.add(fstRow);
        if(rowIndex == 0) return fstRow;
        for(int i=1;i<rowIndex+1;i++){
            List<Integer> prevRow = arr.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1);
            arr.add(currentRow);
        }
        return arr.get(rowIndex);
    }
}