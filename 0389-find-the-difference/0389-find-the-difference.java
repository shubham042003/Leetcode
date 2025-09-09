class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        for(Character a:s.toCharArray()){
            h.put(a,h.getOrDefault(a,0)+1);
        }
        int m=t.length();
        for(Character a:t.toCharArray()){
            if(!h.containsKey(a)){
                return a;
            }else{
                h.put(a,h.get(a)-1);
            }
            if(h.get(a)==0){
                h.remove(a);
            }
        }
        return ' ';
    }
}