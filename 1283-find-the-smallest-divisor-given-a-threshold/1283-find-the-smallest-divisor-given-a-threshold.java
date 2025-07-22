class Solution {
    public int check(int arr[],int mid){
        int sum=0;
        for(int a:arr){
            sum+=a/mid;
            if(a%mid>0){
                sum+=1;
            }
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int s=1;
        int l=Arrays.stream(nums).max().getAsInt();
        int min=Integer.MAX_VALUE;
        while(s<=l){
            int mid=s+(l-s)/2;
            int val=check(nums,mid);
            if(val<=threshold){
                min=Math.min(min,mid);
                l=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return min;
    }
}