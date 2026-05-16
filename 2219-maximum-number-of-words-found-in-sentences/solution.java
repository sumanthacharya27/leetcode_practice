class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=1,res=0;
        for(String str:sentences){
            count=1;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    count++;
                }
            }
            if(count>res){
                res=count;
            }
        }
        return res;
    }
}
