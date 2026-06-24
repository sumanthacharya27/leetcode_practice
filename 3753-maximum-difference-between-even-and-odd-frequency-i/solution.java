class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map= new HashMap<>();
        int maxodd=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> ele: map.entrySet()){
            if(ele.getValue()%2==0) mineven=Math.min(mineven,ele.getValue());
            else maxodd=Math.max(maxodd,ele.getValue());
        }
        return maxodd-mineven;
    }
}
