class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int l=n-1;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[s]==nums[mid] && nums[l]==nums[mid]){
                s++;
                l--;
            }
            else if(nums[s]<= nums[mid]){
                if(nums[s]<=target && nums[mid]>=target){
                    l=mid-1;
                }
                else{
                    s=mid+1;
                }
            }else{
                if(nums[mid]<=target && nums[l]>=target){
                    s=mid+1;
                }
                else{
                    l=mid-1;
                }
            }
        }
        return false;
    }
}