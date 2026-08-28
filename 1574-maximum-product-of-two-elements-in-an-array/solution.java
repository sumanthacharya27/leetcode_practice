class Solution {
    public int maxProduct(int[] nums) {
        int a=0;
        int b=0;
        for(int ele:nums){
            if(ele>a){
                b=a;
                a=ele;
            }else if(ele<=a && ele>b) b=ele;
        }
        a=a-1;
        b=b-1;
        System.out.println(a+"-"+b);
        return a*b;
    }
}
