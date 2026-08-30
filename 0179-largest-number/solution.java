class Solution {
    public String largestNumber(int[] nums) {
        String[] list= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            list[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(list,(a,b)->{
            String ab=""+a+b;
            String ba=""+b+a;
            return ba.compareTo(ab);
        });
        String res= String.join("",list);
        if(res.charAt(0)=='0') return "0";
        return res;
        
    }
}
