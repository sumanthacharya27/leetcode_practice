class Solution {
    public int minPartitions(String n) {
        int min=0;
        for(char ch:n.toCharArray()){
            int digit=ch-'0';
            min=Math.max(min,digit);
        }
        return min;
    }
}
