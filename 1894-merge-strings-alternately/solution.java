class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] mergedstr=new char[word1.length()+word2.length()];
        int index1=0 ;
        
        for(int i=0; i<(word1.length()+word2.length()) ;i++ ){
            if(i<word1.length()){
                mergedstr[index1]=word1.charAt(i);
                index1++;
            }
            if(i<word2.length()){
                mergedstr[index1]=word2.charAt(i);
                index1++;
            }
            
        }
        return String.valueOf(mergedstr);
    }
}
