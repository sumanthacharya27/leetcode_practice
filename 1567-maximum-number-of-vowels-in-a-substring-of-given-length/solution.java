class Solution {
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ;
    }
    public int maxVowels(String s, int k) {
        int left=0;
        int right=0;
        int vowelcount=0;
        int len=0;
        
        while(right<k){
            if(isVowel(s.charAt(right++))) vowelcount++;
        }
        len=vowelcount;
        while(right<s.length()){
            if(isVowel(s.charAt(right))) vowelcount++;
            if(isVowel(s.charAt(left)))  vowelcount--;
            left++;
            right++;
            len=Math.max(len,vowelcount);
        }
        return len;
    }
}
