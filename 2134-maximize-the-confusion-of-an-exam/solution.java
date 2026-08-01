class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        Map<Character,Integer> map= new HashMap<>();
        int len=0 ,max=0;
        int left=0,right=0;

        while(right<answerKey.length()){
            char ch=answerKey.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));
            if((right-left+1)-max<=k){
                len=Math.max(len,right-left+1);
            }else{
                char temp=answerKey.charAt(left);
                map.put(temp,map.get(temp)-1);
                left++;
            }
            right++;
        }
        return len;
    }
}
