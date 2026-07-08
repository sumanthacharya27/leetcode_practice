class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] rightprod = new int[n];
        int[] leftprod= new int[n];
        int[] ans= new int[n];
        leftprod[0]=1;
        rightprod[n-1]=1;
        for(int i=1;i<nums.length;i++){
            leftprod[i]= leftprod[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightprod[i]= rightprod[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=leftprod[i]*rightprod[i];
        }
        return ans;
    }
}
