class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
        }
        if(c==1 && nums[n-1]>nums[0]){
            return false;
        }
        if(c>1) return false;
        return true;
    }
}