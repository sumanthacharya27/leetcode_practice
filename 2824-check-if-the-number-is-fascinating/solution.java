class Solution {
    public boolean isFascinating(int n) {
       String num=""+n+(2*n)+(3*n);
        if(num.length()>9){
            return false;
        }
        char[] chars=num.toCharArray();
        Set<Character> set=new HashSet<>();
        for(char ch:chars){
            if(ch=='0'){
                return false;
            }
            if(!set.add(ch)){
                return false;
            }
        }
        
        return true;

    }
}
