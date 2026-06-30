class Solution {
    public long[] sumOfThree(long num) {
        long x;
        if(num%3!=0) return new long[0];
        else{
            x=(num-3)/3;
        }
        long[] res={x,x+1,x+2};
        return res;

    }
}
