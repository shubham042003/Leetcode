class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int s=0;
        int l=n-1;
        while(s<l){
            int mid=s+(l-s)/2;
            if(nums[mid]>nums[l]){
                s=mid+1;
            }
            else{
                l=mid;
            }
        }
        return nums[s];
    }
}