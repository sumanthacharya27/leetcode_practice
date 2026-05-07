class Solution {
    public String firstPalindrome(String[] words) {
        for(String word :words ){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    public boolean isPalindrome(String word){
        char[] alpha= word.toCharArray();
        String palindrome="";
        for(int i=word.length()-1;i>=0;i--){
            palindrome+=alpha[i];

        } 
        if(palindrome.equals(word)){
            return true;
        }
        return false;
    }
}
