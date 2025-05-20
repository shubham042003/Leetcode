class Solution {
    public String convertToTitle(int n) {
        StringBuilder s=new StringBuilder();
        while(n>0){
            int d=(n-1)%26;
            s.append((char)('A'+d));
            n=(n-1)/26;
        }
        return s.reverse().toString();
    }
}