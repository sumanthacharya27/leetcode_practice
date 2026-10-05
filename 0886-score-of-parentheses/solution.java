class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stk = new ArrayDeque<>();
        Deque<Integer> res = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stk.push(i);
                res.push(0);
            }
            else {
                int ind = stk.pop();
                int inside = res.pop();
                int count = 0;
                if (i == (ind + 1)) {
                    count = 1;
                } else {
                    count = inside * 2;
                }
                if (res.isEmpty()) {
                    res.push(count);
                } else {
                    res.push(res.pop() + count);
                }

            }
        }
        System.out.println(res);

        return res.pop();
    }
}
