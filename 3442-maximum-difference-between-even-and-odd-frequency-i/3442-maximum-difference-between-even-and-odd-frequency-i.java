class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        int maxodd=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }else{
                h.put(c,1);
            }
        }

        for(char c:h.keySet()){
            if((h.get(c))%2==1){
                maxodd=Math.max(maxodd,h.get(c));
            }
            else{
                mineven=Math.min(mineven,h.get(c));
            }
        }
        return maxodd-mineven;
    }
}