class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0){
            return nums;
        }
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
        int[] freq=new int[k];
        for(int i=0;i<k;i++ ){
            freq[i]=list.get(i).getKey().intValue();
        }
       
        return freq;
        
    }
}
