class Solution {
    public boolean canEat(int[] piles,int h,double n){
        int count=0;
        for(int i=0;i<piles.length;i++){
            count+=Math.ceil(piles[i]/n);
            if(count>h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int ele:piles){
            right=(right<ele)? ele:right;
        }
        int min=right;
        while(left<right){
            int mid=left+(right-left)/2;
            if(canEat(piles,h,(double)mid)){
                min=mid;
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return min;
    }
}
