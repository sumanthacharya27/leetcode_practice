class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new ArrayList<>();
        if(s.length()<p.length()) return res;
        int left=0;
        int right;

        int[] patfreq= new int[26];
        int[] freq= new int[26];
        for(char ch:p.toCharArray()){
            patfreq[ch-'a']++;
        }
        for(right=0;right<p.length();right++){
            freq[s.charAt(right)-'a']++;
        }

        while(right<s.length()){
            if(Arrays.equals(freq,patfreq)) res.add(left);
            freq[s.charAt(right)-'a']++;
            freq[s.charAt(left)-'a']--;
            left++;
            right++;
        }
        if(Arrays.equals(freq,patfreq)) res.add(left);
        return res;
    }
}
