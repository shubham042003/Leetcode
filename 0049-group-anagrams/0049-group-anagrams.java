class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();
        HashMap<String,Integer> h=new HashMap<>();
        int e=0;
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String d = new String(c);
            if(h.containsKey(d)){
                l.get(h.get(d)).add(s);
            }
            else{
                h.put(d,e);
                l.add(new ArrayList<>());
                l.get(e).add(s);
                e++;
            }
        }
        return l;
    }
}