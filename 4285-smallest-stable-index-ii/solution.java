class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] minarr=new int[n];
        // int[] maxarr= new int[nums.length];

        int max=Integer.MIN_VALUE;
        // int stable=-1;
        minarr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            minarr[i]=Math.min(minarr[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-minarr[i]<=k){
                return i;
            } 
        }
        return -1;
    }
}
