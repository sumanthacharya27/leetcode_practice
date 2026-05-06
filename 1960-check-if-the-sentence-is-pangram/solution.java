class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> freq= new HashSet<>();
        char[] letters=sentence.toCharArray();
        
        for(int i=0;i<letters.length;i++){
            freq.add(letters[i]);
        }
        System.out.println(freq.size());
        if(freq.size()==26) return true;

        return false;

    }
}
