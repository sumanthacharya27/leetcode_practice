class Solution {
    public int addDigits(int num) {
    
        while(num>=10)
        {
            num=sum(num);
        }
        return num;
    }
    int sum(int n)
    {
        int sum=0;
        int rem=n;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}
