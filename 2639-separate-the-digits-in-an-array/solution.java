class Solution {
    public int[] separateDigits(int[] nums) {
         ArrayList<Character> list=new ArrayList<>();
        for(int i=0; i<nums.length;i++){
                for(char ch: String.valueOf(nums[i]).toCharArray()){
                    list.add(ch);
                }
        }
        //System.out.println(list);
        int[] output= new int[list.size()];
        for(int j=0;j<list.size();j++){
            output[j]=list.get(j)-'0';
        }
        return output;
    }
}
