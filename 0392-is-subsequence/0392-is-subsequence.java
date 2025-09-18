class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int j=0;
        if(n==0) return true;
        if(n!=0 && m==0) return false;
        if(n==0 && m==0) return true;
        for(int i=0;i<m;i++){
            if(j==n) return true;
            char c=t.charAt(i);
            char d=s.charAt(j);
            if(d==c){
                j++;
            }
        }
        if(j==n) return true;
        return false;
    }
}