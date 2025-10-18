class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> h=new HashMap<>();
        // int r=0;
        // for(int n:nums){
        //     h.put(n,h.getOrDefault(n,0)+1);
        // }
        // for(int k:h.keySet()){
        //     if(h.get(k)==1){
        //         r=k;
        //     }
        // }
        // return r;

        int ones=0,twos=0;
        for(int i=0;i<nums.length;i++){
            ones=(ones^nums[i])& ~twos;
            twos=(twos^nums[i])& ~ones;
        }
        return ones;
    }
}