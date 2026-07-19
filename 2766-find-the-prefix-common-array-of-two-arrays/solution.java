class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       Set<Integer> set= new HashSet<>();
       int[] res= new int[A.length];
       int count=0;
       for(int i=0;i<A.length;i++){
        int oldsize=set.size();
        set.add(A[i]);
        set.add(B[i]);
        int dif=2-(set.size()-oldsize);
        count+=dif;
        res[i]=count;
       }
       return res;
    }
}
