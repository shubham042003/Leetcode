class Solution {
    public void moveZeroes(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[b]!=0){
                int t=nums[a];
                nums[a]=nums[b];
                nums[b]=t;
                b++;
                a++;
                continue;
            }
            b++;

        }
    }
}