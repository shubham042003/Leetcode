class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums1){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            }else{
                h.put(i,1);
            }
        }
        for(int i:nums2){
            if(h.get(i)==null) continue;
            if(h.get(i)==0){
                h.remove(i);
            }
            if(h.containsKey(i)){
                h.put(i,h.get(i)-1);
                a.add(i);
            }
        }
        int ns=a.size();
        int b[]=new int[ns];
        for(int i=0;i<ns;i++){
            b[i]=a.get(i);
        }
        return b;
    }
}