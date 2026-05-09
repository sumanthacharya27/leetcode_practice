class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char[] charString;
        String sortedString;
        HashMap <String,List<String>> sorted= new HashMap <>();
        for(String str:strs){
            charString = str.toCharArray();
            Arrays.sort(charString);
            sortedString= String.valueOf(charString);
            sorted.putIfAbsent(sortedString,new ArrayList<>());
            sorted.get(sortedString).add(str);
        }
        

        return (new ArrayList(sorted.values()));
    }
}
