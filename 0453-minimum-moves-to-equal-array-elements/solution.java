class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int[] diff=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            diff[i]=nums[i]-min;
            sum+=diff[i];
        }
        return sum;
    }
}
