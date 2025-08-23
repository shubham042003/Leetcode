class Solution {
    public int[] transformArray(int[] nums) {
        int ce=0;
        int co=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ce++;
            }else{
                co++;
            }
        }
        for(int i=0;i<n;i++){
            if(ce!=0){
                nums[i]=0;
                ce--;
            }else{
                nums[i]=1;
                co--;
            }
        }
        return nums;
    }
}