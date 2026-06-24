class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map=new HashMap<>();
        for(int ch:nums){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> sorted= new ArrayList<>(map.entrySet());
        sorted.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int count=0;
        int[] res= new int[k];
        for(Map.Entry<Integer,Integer> ele:sorted){
            res[count++]=ele.getKey();
            if(count==k) break;
        }
        return res;
        
    }
}
