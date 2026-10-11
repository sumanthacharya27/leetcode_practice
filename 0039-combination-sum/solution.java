class Solution {
    public void backtrack(List<List<Integer>> res, int[] nums,int target,List<Integer> curr,int begin,int sum){
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target) return;
        for(int i=begin;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(res,nums,target,curr,begin,sum+nums[i]);
            curr.remove(curr.size()-1);
            begin++;
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res,candidates,target,new ArrayList<>(),0,0);//(-,-,-,curr,index,total)
        return res;
    }
}
