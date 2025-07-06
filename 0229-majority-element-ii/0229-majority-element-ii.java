class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int t=n/3;
        List<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()>t){
                a.add(e.getKey());
            }
        }
        return a;
    }
}