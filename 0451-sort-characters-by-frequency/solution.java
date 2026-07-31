class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map= new HashMap<>();
        StringBuilder sb= new StringBuilder();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<Character,Integer> entry:list){
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
