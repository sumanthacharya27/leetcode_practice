class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max_avg=0;
        for(int i=0;i<k;i++){
            max_avg+=nums[i];
        }
        int window_avg=max_avg;
        
        for(int i=k;i<nums.length;i++){
            window_avg+=nums[i]-nums[i-k];
            max_avg=Math.max(window_avg,max_avg);
        }
        return (double)max_avg/k;
    }
}
