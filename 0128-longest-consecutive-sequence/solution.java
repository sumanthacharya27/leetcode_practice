class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
       }
       int len=0;
       for(int ele:set){
        int count=1;
        if(!set.contains(ele-1)){
            int i=1;
            while(set.contains(ele+i)){
                count++;
                i++;
            }
        }
        len=Math.max(len,count);
       }
       return len;
    }
}
