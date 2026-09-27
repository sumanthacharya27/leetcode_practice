class Solution {
    public void reverse(StringBuilder s,int start,int end){
        while(start<=end){
            char ch=s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,ch);
            start++;
            end--;
        }
    }
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack= new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i-count);
                count++;
            }else if(s.charAt(i)==')'){
                int start=stack.pop();
                count++;
                reverse(sb,start,i-count);
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
