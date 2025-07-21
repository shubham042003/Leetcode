class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int c=0;
        int max=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                c++;
                max=Math.max(max,c);
            }
            else if(ch==')'){
                c--;
            }
        }
        return max;
    }
}