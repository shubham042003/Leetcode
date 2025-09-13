class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> s=new HashSet<>();
        for(char c:jewels.toCharArray()){
            s.add(c);
        }
        int c=0;
        for(char ch:stones.toCharArray()){
            if(s.contains(ch)){
                c++;
            }
        }
        return c;
    }
}