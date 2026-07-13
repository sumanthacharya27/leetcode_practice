class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack= new ArrayDeque<>();

        for(String ch:tokens){
            int n2=0;
            int n1=0;
            String op= ch;
            int res=0;
            if(ch.equals("+")) {
                n2=stack.pop();
                n1=stack.pop();
                res=n1+n2;
                stack.push(res);
            } 
            else if(ch.equals("-")) {
                n2=stack.pop();
                n1=stack.pop();
                res=n1-n2;
                stack.push(res);
            }
            else if(ch.equals("*")) {
                n2=stack.pop();
                n1=stack.pop();
                res=n1*n2;
                stack.push(res);
            }
            else if(ch.equals("/")) {
                n2=stack.pop();
                n1=stack.pop();
                res=n1/n2;
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}
