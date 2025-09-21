class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=arr.length;
        int max=0;
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            if(e.getKey() == e.getValue()){
                max=Math.max(max,e.getKey());
            }
        }
        if(max==0) return -1;
        return max;
    }
}