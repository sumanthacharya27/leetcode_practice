class Solution {
    public int isPeak(int num) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            int a = s.charAt(i - 1) - '0';
            int b = s.charAt(i) - '0';
            int c = s.charAt(i + 1) - '0';
            // System.out.println(a);
            // System.out.println(b);
            // System.out.println(c);
            if ((b > a && b > c) || (b < a && b < c))
                count++;
        }
        return count;
    }

    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (i < 100)
                continue;
            count += isPeak(i);
            // System.out.println("count is :" + count);
        }
        return count;
    }
}
