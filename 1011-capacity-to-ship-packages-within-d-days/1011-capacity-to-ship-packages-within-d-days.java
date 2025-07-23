class Solution {
    public int check(int arr[],int mid){
        int sum=0;
        int c=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>mid){
                c++;
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
        }
        return c;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int s=Arrays.stream(weights).max().getAsInt();;
        int l=0;
        for(int i:weights){
            l+=i;
        }
        int min=Integer.MAX_VALUE;
        while(s<=l){
            int mid=s+(l-s)/2;
            int val=check(weights,mid);
            if(val<=days){
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