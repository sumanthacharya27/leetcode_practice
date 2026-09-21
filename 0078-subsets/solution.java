class Solution {
    public void backtracking(int[] nums,List<List<Integer>> result,int index,List<Integer> curr){
        if(index==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtracking(nums,result,index+1,curr);
        curr.remove(curr.size()-1);
        backtracking(nums,result,index+1,curr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        backtracking(nums,result,0,new ArrayList<>()); //set,result set,curr index,curr subset
        return result;
    }
}
