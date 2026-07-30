class Solution {
    public int longestContinuousSubstring(String s) {
        // if(s.length()==1) return 1;
        int count=1;
        int max=0;
        // int j=1;
        char prev=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==(prev+1)){
                
                count++;
                // j++;
            }else{
                max=Math.max(max,count);
                // j=0;
                count=1;
            }
            prev=s.charAt(i);
        }
        max=Math.max(max,count);
        return max;
    }
}
