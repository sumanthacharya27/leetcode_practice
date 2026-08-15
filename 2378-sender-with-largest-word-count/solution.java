class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map= new HashMap<>();
        for(int i=0;i<messages.length;i++){
            map.put(senders[i],map.getOrDefault(senders[i],0)+(messages[i].split(" ").length));
        }
        String ans= new String();
        int len=0;
        for(String str: map.keySet()){
            if(map.get(str)>len){
                len=map.get(str);
                ans=str;
            }else if(map.get(str)==len){
                if(str.compareTo(ans)>0){
                    ans=str;
                }
            }
        }
        return ans;
    }
}
