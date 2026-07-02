class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] patfreq= new int[26];
        int[] freq= new int[26];
        int left=0;
        int right;
        boolean flag=false;
        for(char ch:s1.toCharArray()){
            patfreq[ch-'a']++;
        }
        for(right=0;right<s1.length();right++){
            freq[s2.charAt(right)-'a']++;
        }
        while(right<s2.length()){
            if(Arrays.equals(freq,patfreq)) flag=true;
            freq[s2.charAt(right)-'a']++;
            freq[s2.charAt(left)-'a']--;
            left++;
            right++;
        }
         if(Arrays.equals(freq,patfreq)) flag=true;
        return flag;
    }
}
