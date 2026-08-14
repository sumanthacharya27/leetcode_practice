class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map= new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<Map.Entry<String,Integer>> sortedlist= new ArrayList<>(map.entrySet()); 
        sortedlist.sort((a,b)->{
            int freq=Integer.compare(b.getValue(),a.getValue());
            if(freq!=0) return freq;
            return a.getKey().compareTo(b.getKey());
        });
        List<String> res= new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(sortedlist.get(i).getKey());
        }
        return res;
    }
}
