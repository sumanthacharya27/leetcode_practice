class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int lar = 1;
        int left = 0, right = 1;
        int newstart = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);

        while (right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
                lar = Math.max(lar, right - left + 1);
                right++;
            } else {
                newstart = map.get(s.charAt(right)) + 1;
                while (left < newstart) {
                    map.remove(s.charAt(left));
                    left++;
                }
                map.put(s.charAt(right), right);
                right++;
            }
        }
        return lar;
    }
}
