class Solution {
    public int strStr(String haystack, String needle) {
        int left=0;
        int right=needle.length();
        if(left==right-1 && haystack.equals(needle)) return left;
        while(right<=haystack.length()){
            if(haystack.substring(left,right).equals(needle)){
                return left;
            }
            left++;
            right++;
        }
        return -1;
    }
}
