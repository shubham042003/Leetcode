class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(maxIndex<i) return false;
            maxIndex=Math.max(i+nums[i],maxIndex);
        }
        return true;
    }
}