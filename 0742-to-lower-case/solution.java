class Solution {
    public String toLowerCase(String s) {
        char[] low= s.toCharArray();
        for(int i=0  ;i<low.length ; i++){
            if(low[i]>='A' && low[i]<='Z'){
                low[i]=(char)(low[i]+32);
            }
        }
        return String.valueOf(low);
    }
}
