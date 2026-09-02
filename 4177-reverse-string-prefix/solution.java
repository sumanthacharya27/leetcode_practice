class Solution {
    public String reversePrefix(String s, int k) {
        char[] res= s.toCharArray();
        int left=0;
        int right=k-1;
        while(left<right){
            char temp=res[left];
            res[left]=res[right];
            res[right]=temp;
            left++;
            right--;
        }
        return String.valueOf(res);
    }
}
