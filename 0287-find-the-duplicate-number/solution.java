class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> list= new HashSet<>();
       int key=0;
       for (int i =0; i<nums.length;i++){
        if(!list.add(nums[i])){
            key=nums[i];
        }
       }
       return key;
    }
}
