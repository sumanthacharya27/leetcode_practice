class Solution {
    StringBuilder curr=new StringBuilder();
    public void backtrack(int n,List<String> res,int open,int close){
        if(curr.length()==n*2){
            res.add(new String(curr.toString()));
        }
        if(open<n){
            curr.append('(');
           backtrack(n,res,open+1,close);
           curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(')');
            backtrack(n,res,open,close+1);
            curr.deleteCharAt(curr.length()-1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        backtrack(n,res,0,0);
        return res;
    }
}
