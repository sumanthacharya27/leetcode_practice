class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int res=0;
        Stack<Integer> stack=  new Stack<>();
        stack.push(nums[nums.length-1]);
        for(int i=nums.length-2;i>=k;i--){
            if(stack.peek()<nums[i]) stack.push(nums[i]);
            else stack.push(stack.peek());
        }
        for(int i=0;i<nums.length;i++){
            if(!stack.isEmpty()) res=Math.max(res,nums[i]+stack.pop());
        }

        return res;
    }
}
