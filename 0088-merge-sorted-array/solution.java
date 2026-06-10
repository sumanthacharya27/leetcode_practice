class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            nums1[left]=nums2[right];
            left++;
            right++;
        }
        Arrays.sort(nums1);
    }
}
