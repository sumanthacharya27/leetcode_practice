class Solution {
    public int reverse(int x) {
        int rem=0,num=0;
        int flag=0;
        if(x<0){
            flag=1;
        }
        x=Math.abs(x);
        while(x>0)
        {
            rem=x%10;
            if(num > Integer.MAX_VALUE/10 || num== Integer.MAX_VALUE && num>7)
            {
                return 0;
            }
            if(num<Integer.MIN_VALUE/10  || num== Integer.MIN_VALUE && num <-8)
            {
                return 0;
            }
            num=num*10+rem;
            x=x/10;
        }
        if(flag==1){
            num=-num;
        }
        return num;
    }
}
