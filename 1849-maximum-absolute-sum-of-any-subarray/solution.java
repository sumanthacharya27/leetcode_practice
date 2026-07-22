class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int max=Integer.MIN_VALU;
        // int min=Integer.MAX_VALUE;
        int max=0;
        int min=0;
        int sum=0;
        for(int ele:nums){
            sum+=ele;
            max=Math.max(max,sum);
            min=Math.min(min,sum);
            // if(maxsum<0) maxsum=0;
            // if(minsum>0) minsum=0;
        }
        // System.out.println("min "+min+"/max "+max);
        return max-min;
        // return Math.max(Math.abs(max),Math.abs(min));
    }
}
