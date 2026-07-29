class Solution {
    public int halveArray(int[] nums) {
        // if(nums.length==1) return 1;
        PriorityQueue<Double> pq= new PriorityQueue<>(Collections.reverseOrder());
        double currsum=0.0;
        for(double ele : nums){
            pq.offer(ele);
            currsum+=ele;
        }
        int count=0;
        double num=currsum/2.0;

        while(!pq.isEmpty() && currsum>num){
            double half=pq.poll()/2.0;
            currsum-=half;
            pq.offer(half);
            count++;
        }
        return count;
    }
}
