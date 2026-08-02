class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n1=max(nums)-1
        nums.remove(n1+1)
        n2=max(nums)-1
        return n1*n2
        