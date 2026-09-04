class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int[] res= new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            res[i+1]=res[i]+gain[i];
            max=Math.max(max,res[i+1]);
        }
        return max;
    }
}
