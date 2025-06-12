class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                int c=i-h.get(nums[i]);
                if(c<=k) return true;
            }
            h.put(nums[i],i);
        }
        return false;
    }
}