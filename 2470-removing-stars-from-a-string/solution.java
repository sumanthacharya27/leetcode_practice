class Solution {
    public String removeStars(String s) {
        StringBuilder stack =new StringBuilder();
        for(int i=0 ; i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i)=='*'){
                stack.deleteCharAt(stack.length()-1);
            }else{
                stack.append(s.charAt(i));
            }
            
        }
        return stack.toString();
    }
}
