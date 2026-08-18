class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] isbanned= new boolean[n+1];
        for(int ele:banned){
            if(ele<=n) isbanned[ele]=true;
        }
        int sum=0;
        int i=1;
        int count=0;
        while(i<=n && sum<=maxSum){
            if(isbanned[i]){
                i++;
                continue;
            }else{
                sum+=i;
                count++;
            }
            if(sum>maxSum){
                sum-=i;
                count--;
            }
            i++;
        }
        return count;
    }
}
