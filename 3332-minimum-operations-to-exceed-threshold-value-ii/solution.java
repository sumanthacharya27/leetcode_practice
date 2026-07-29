class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer((long)nums[i]);
        }

        Long a, b; 
        int count=0;
        while(!pq.isEmpty() && pq.peek()<k){
            if(pq.size()<2) break;
            a=pq.poll();
            b=pq.poll();
            Long sum=Math.min(a,b)*2+Math.max(a,b);
            pq.offer(sum);
            count++;
        }
        return count;
    }
}
