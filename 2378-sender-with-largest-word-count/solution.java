class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map= new HashMap<>();
        for(int i=0;i<messages.length;i++){
            map.put(senders[i],map.getOrDefault(senders[i],0)+(messages[i].split("\\s").length));
        }
        List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            int freq=Integer.compare(b.getValue(),a.getValue());
            if(freq!=0) return freq;
            return b.getKey().compareTo(a.getKey());
        }) ;
        return list.get(0).getKey();
    }
}
