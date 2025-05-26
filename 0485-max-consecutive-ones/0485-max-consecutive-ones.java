class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int c=0,m=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                c++;
                m=Math.max(m,c);
            }else{
                c=0;
            }
        }
        return m;
    }
}