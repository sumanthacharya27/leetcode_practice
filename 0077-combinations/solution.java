class Solution {
    public void backtrack(List<List<Integer>> res,int n,int k,int start,List<Integer> curr){
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            backtrack(res,n,k,++start,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res,n,k,1,new ArrayList<>());
        return res;
    }
}
