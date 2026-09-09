class Solution {
    public long countCommas(long n) {
        if(n<999) return 0;
        long count=0;
        long range=1000;
        while(range<=n){
            count+=n-range+1;
            range=(range*1000);
        }
        return count;
    }
}
