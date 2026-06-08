class Solution {
    public boolean checkString(String s) {
        char[] ch=s.toCharArray();
        for(int i=1;i<ch.length;i++){
            if(ch[i]=='a' && ch[i-1]=='b'){
                return false;
            }
        }
        return true;
    }
}
