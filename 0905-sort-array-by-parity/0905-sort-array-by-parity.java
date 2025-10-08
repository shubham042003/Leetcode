class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                b[l]=nums[i];
                l++;
            }else{
                b[r]=nums[i];
                r--;
            }
        }
        return b;
    }
}