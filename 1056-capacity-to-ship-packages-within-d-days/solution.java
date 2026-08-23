class Solution {
    public boolean canShip(int[] weights, int days, int cap) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] <= cap)
                sum += weights[i];
            else {
                sum = weights[i];
                count++;
            }
            
        }
        return count+1 <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int left =1;
        int right = 0;
        for (int ele : weights) {
            left=Math.max(left,ele);
            right += ele;
        }
        int cap = right;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid;
                cap = Math.min(cap,mid);
            } else {
                left = mid + 1;
            }
        }
        return cap;
    }
}
