class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=1;
        int maxseq=0;
        for(Integer ele:set){
            if(!set.contains(ele-1)){
                int i=1;
                while(set.contains(ele+i)){
                    count++;
                    i++;
                }
            }
            maxseq=Math.max(count,maxseq);
            count=1;
        }
        return maxseq;
    }
}
