class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n= shifts.length;
        StringBuilder sb= new StringBuilder();
        long[] prefix= new long[n];
        prefix[n-1]=shifts[n-1];
        for(int i=n-2;i>=0;i--){
            prefix[i]=prefix[i+1]+shifts[i];
        }
        int i=0;
        for(char ch:s.toCharArray()){
            long c=ch-'a'+prefix[i];
            if(c>25){
                c%=26;
                sb.append((char)(c+'a'));
            }else{
                sb.append((char)(c+'a'));
            }
            i++;
        }
        return sb.toString();
    }
}
