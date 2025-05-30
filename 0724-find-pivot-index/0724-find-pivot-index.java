class Solution {
    public int pivotIndex(int[] nums) {
        int p=-1;
        int n=nums.length;
        int s1=0,s2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<i){
                    s1=s1+nums[j];
                }
                else if(j>i){
                    s2=s2+nums[j];
                }
            }
            if(s1==s2) return i;
            s1=0;
            s2=0;
        }
        return p;
    }
}