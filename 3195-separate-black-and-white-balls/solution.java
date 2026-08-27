class Solution {
    public long minimumSteps(String s) {
        long zero=0;
        long one=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0') zero++;
            else one+=zero;
        }
        return one;
    }
}
