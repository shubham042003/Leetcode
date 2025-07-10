class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(h.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}