class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res= new int[nums.length*2];
        int left=0;
        int right =nums.length;
        for(int i=0;i<nums.length;i++){
            res[left++]=nums[i];
            res[right++]=nums[i];
        }
        return res;
    }
}
