class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int k=nums.length/3;
        List<Integer> res= new ArrayList<>();
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>k) res.add(entry.getKey());
        }
        return res;

    }
}
