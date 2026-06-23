class Solution {
    public int addDigits(int num) {

        while(num>9){
            int digit=num%10;
            num/=10;
            num+=digit;
        }
        return num;
    }
}
