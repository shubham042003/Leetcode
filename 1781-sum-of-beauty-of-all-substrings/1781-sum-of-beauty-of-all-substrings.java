class Solution {
    public int beautySum(String s) {
        StringBuilder w=new StringBuilder(s);
        int n=w.length();
        int sum=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                char c=w.charAt(j);
                h.put(c,h.getOrDefault(c,0)+1);
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for (int val: h.values()) {
                    max=Math.max(max,val);
                    min=Math.min(min,val);
                }
                sum+=(max-min);
            }
            h.clear();
        }
        return sum;
    }
}