class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        // for(int ele:nums){
            int i=1;
            while(set.contains(i)){
                i++;
            }
        // }
        return i;
    }
}
