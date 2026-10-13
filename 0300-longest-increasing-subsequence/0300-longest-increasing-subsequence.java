class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for(int x:nums){
            if(res.isEmpty() || res.get(res.size()-1)< x){
                res.add(x);
            }else{
                int idx=binarySearch(res,x);
                res.set(idx,x);
            }
        }

        return res.size();
    }

    private int binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }    
}