class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i:nums){
            a.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(a.contains(i)) continue;
            b.add(i);
        }
        return b;
    }
}