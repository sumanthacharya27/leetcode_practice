class Solution {
    public int subtractProductAndSum(int n) {
        int digitsum=0;
        int digitprod=1;
        while(n>0){
            int digit=n%10;
            digitsum+=digit;
            digitprod*=digit;
            n/=10;
        }
        return digitprod-digitsum;
    }
}
