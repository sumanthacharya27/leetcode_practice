class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=2) return nums.length;
        int minleft=0;
        int maxleft=0;
        int minright=nums.length-1;
        int maxright=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxleft]) maxleft=i;
            if(nums[i]<nums[minleft]) minleft=i;
        }
        System.out.println(minleft+" - "+maxleft);
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[maxright]) maxright=i;
            if(nums[i]<nums[minright]) minright=i;
        }
        System.out.println(minright+" - "+maxright);
        
        int left=Math.max(minleft,maxleft)+1;
        int right=nums.length-Math.min(minright,maxright);
        int mix=(Math.min(minleft,maxright)+1)+(nums.length-Math.max(minright,maxright));
        return Math.min(left,Math.min(right,mix));
    }
}
