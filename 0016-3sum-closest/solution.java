class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=Integer.MAX_VALUE;
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    res=sum;
                    break;
                }else if(sum>target){
                    right--;
                }else{
                    left++;
                }
                int diff=Math.abs(Math.max(target,sum)-Math.min(target,sum));
                if(diff<mindiff){
                    res=sum;
                    mindiff=diff;
                }
            }
            // if(res==sum) break;
        }
        return res;
    }
}
