class Solution {
    public boolean hasAlternatingBits(int n) {
        char[]  bits=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<bits.length-1;i++){
            if(bits[i]==bits[i+1]){
                return false;
            }
        }

        return true;
    }
}
