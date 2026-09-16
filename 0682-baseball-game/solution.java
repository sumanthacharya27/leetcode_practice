class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String str : operations) {
            if (str.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a);
                stack.push(b);
                stack.push(a + b);
            } else if (str.equals("D")) {
                stack.push(stack.peek() * 2);

            } else if (str.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
