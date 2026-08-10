class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1 , last=-1;
        int[] res= new int[2];
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }else if (target>nums[mid]) left=mid+1;
            else right=mid-1;
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                last=mid;
                left=mid+1;
            }else if(target>nums[mid]) left=mid+1;
            else right=mid-1;
        }
        res[0]=first;
        res[1]=last;

        return res;
    }
}
