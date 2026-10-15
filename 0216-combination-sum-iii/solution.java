class Solution {
    public void backtrack(List<List<Integer>> res,int k,int n,List<Integer> curr, int index,int sum){
        if(curr.size()==k){
            if(sum==n) res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<10;i++){
            if((sum+i)>n) return;
            curr.add(i);
            backtrack(res,k,n,curr,i+1,sum+i);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res,k,n,new ArrayList<>(),1,0); //index,sum
        return res;
    }
}
