class Solution {
   public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length ;i++){
            int n=sum(nums[i]);
            if(n<min){
                min=n;
            }
        }
        return min;

    }
    public int sum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}
