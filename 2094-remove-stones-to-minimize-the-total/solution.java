class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for(int ele:piles){
            sum+=ele;
            pq.offer(ele);
        }
        for(int i=0;i<k;i++){
            int temp=pq.poll();
            int half=(temp+1)/2;
            sum-=(temp-half);
            pq.offer(half);
        }
        return sum;
    }
}
