class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder stack= new StringBuilder();
        Stack<Integer> freq=new Stack<>();

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.charAt(stack.length()-1)==ch){
                stack.append(ch);
                freq.push(freq.peek()+1);
                if(freq.peek()==k){
                    while(stack.charAt(stack.length()-1)==ch){
                        freq.pop();
                        stack.deleteCharAt(stack.length()-1);
                        if(stack.isEmpty() || freq.isEmpty()) break;
                    }
                }
            }else{
                stack.append(ch);
                freq.push(1);
            }
        }
        return stack.toString();
    }
}
