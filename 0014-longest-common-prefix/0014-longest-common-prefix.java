class Solution {
    public String longestCommonPrefix(String[] strs) {
        String w=strs[0];
        int n=w.length();
        String b="";
        for(int i=0;i<n;i++){
            String a=w.substring(0,i+1);
            for(int j=1;j<strs.length;j++){
                if(!strs[j].startsWith(a)){
                    return b;
                }
            }
            b=a;
        }
        return b;
    }
}