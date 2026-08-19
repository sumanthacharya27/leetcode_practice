class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        List<Integer> list= new ArrayList<>();
        Set<Integer> set= new HashSet<>();
        for(int ele:nums){
            set.add(ele);
            if(ele>max) max=ele;
            if(ele<min) min=ele;
        } 
            

        for(int i=min;i<max;i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}
