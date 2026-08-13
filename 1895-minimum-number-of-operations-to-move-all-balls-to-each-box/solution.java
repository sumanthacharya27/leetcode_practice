class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] res= new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                count++;
                if(boxes.charAt(j)=='1'){
                    res[i]+=count;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            int count=0;
            for(int j=i-1;j>=0;j--){
                count++;
                if(boxes.charAt(j)=='1'){
                    res[i]+=count;
                }
            }
        }
        return res;
    }
}
