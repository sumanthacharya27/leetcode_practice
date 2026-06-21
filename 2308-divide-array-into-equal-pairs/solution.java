class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for( Map.Entry<Integer,Integer> ele: map.entrySet()){
            if(ele.getValue()%2!=0) return false;
        }
        return true;
    }
}
