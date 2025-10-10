class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int l=0,r=0,c=0;
        String s="";
        while(r<n){
            if(r==n-1){
                if(c==0){
                    s=s+chars[r];
                }else{
                    c=c+1;
                    s=s+chars[r]+c;
                    c=0;
                }
                r++;
                break;
            }
            if(chars[r]==chars[r+1]){
                c++;
                r++;
            }else{
                if(c==0){
                    s=s+chars[r];
                }else{
                    c=c+1;
                    s=s+chars[r]+c;
                    c=0;
                }
                r++;
                l=r;
            }
        }
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}