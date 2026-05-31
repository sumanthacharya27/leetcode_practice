class Solution {
    public int passwordStrength(String password) {
        boolean[] seen=new boolean[128];
        int res=0;
        for(int i=0;i<password.length() ;i++){
            char ch=password.charAt(i);
            if(seen[ch]==true) continue;
            seen[ch]=true;

            if(ch>='a' && ch<='z') res+=1;
            else if(ch>='A' && ch<='Z') res+=2;
            else if(ch>='0' && ch<='9') res+=3;
            else res+=5;
        }
        return res;
    }
}
