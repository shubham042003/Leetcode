class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int uc=0,lc=0,f=0;
        for(int i=0;i<n;i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)){
                uc++;
            }else{
                lc++;
            }
        }
        if(Character.isUpperCase(word.charAt(0))){
            f++;
        }
        if(uc==n || lc==n) return true;
        if(f==1 && lc==n-1) return true;
        return false;
    }
}