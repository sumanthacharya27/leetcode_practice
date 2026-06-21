class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int n:costs){
            if(coins>0 && coins>=n){
                count++;
                coins-=n;
            }else break;
        }
        return count;
    }
}
