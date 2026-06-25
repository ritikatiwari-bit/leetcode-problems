class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums=nums1+nums2
        nums.sort()
        n=len(nums)
        avg=n//2
        if n%2==0:
            median=(nums[avg]+nums[avg-1])/2
        else:
            median=nums[avg]
        return median