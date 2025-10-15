class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int c=0,l=0;
        for(int a:h.values()){
            if(a%2==1){
                c=1;
            }
            l=l+(a/2)*2;
        }
        if(c==1){
            l++;
        }
        return l;
    }
}