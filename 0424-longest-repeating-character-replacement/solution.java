class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq= new int[26];
        int max=0;
        int len=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            max=Math.max(max,freq[ch-'A']);
            if((right-left+1)-max<=k){
                len=Math.max(len,(right-left+1));

            }else{
                freq[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return len;
    }
}
