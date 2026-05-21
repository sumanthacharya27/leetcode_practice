class Solution {
    public String reverseWords(String s) {
       String[] words=s.strip().split("\\s+");
       //String[] reversed=new String[words.length];
       StringBuilder sb= new StringBuilder();
       for(int i=words.length-1; i>=0;i--){
        sb.append(words[i]);
        if(i!=0){
            sb.append(" ");
        }
       }
       return sb.toString();

    //    int i=words.length-1;
    //    for(String word:words){
    //     reversed[i]=word;
    //     i--;
    //    }
       
        // for(int i=words.length-1 , j=0 ; i>=0 && j<words.length ;i-- , j++){
        //  reversed[j]=words[i];
        // }

      // return String.join(" ",reversed);

    }
}
