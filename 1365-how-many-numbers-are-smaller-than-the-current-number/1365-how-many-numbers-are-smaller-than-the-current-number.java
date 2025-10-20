class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int c=0,k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            a[k]=c;
            c=0;
            k++;
        }
        return a;
    }
}