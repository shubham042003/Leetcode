class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> h=new HashMap<>();
        HashMap<Character,Integer> t=new HashMap<>();
        for(char c:chars.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int sum=0,e=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            String c=words[i];
            t.clear();
            for(char d:c.toCharArray()){
                t.put(d,t.getOrDefault(d,0)+1);
            }
            e=0;
            for(char a:t.keySet()){
                if(!h.containsKey(a) || t.get(a)>h.get(a)){
                    e=1;
                    break;
                }
            }
            if(e==0){
                sum+=c.length();
            }
        }
        return sum;
    }
}