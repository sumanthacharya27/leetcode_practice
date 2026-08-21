class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // We are going downhill.
                // A peak is at mid or somewhere on the left.
                right = mid;
            } else {
                // We are going uphill.
                // A peak must exist on the right.
                left = mid + 1;
            }
        }

        return left;
    }
}
