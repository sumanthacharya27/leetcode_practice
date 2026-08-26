class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int right=0;
        List<String> list= new ArrayList<>();
        int count=0; 
        while(right<s.length()){
            if(s.charAt(right)=='1') count++;
            while(count==k){
                list.add(s.substring(left,right+1));
                if(s.charAt(left)=='1') count--;
                left++;
            }
            right++;
        }
        list.sort((str1,str2)->{
            // String str1=a.replaceFirst("^0+","");
            // String str2=b.replaceFirst("^0+","");

            if(str1.length()!=str2.length()) return Integer.compare(str1.length(),str2.length());
            return str1.compareTo(str2);
        });
        return (list.size()>=1)? list.get(0).replaceFirst("^0+","") : "";
    }
}
