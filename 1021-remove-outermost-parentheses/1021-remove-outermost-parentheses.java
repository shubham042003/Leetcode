class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int c=0;
        String w="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(c>0) w+=ch;
                c++;
            }else{
                c--;
                if(c>0) w+=ch;
            }
        }
        return w;
    }
}