class Solution {
    public int helper(int[] arr,int mid,int n){
        long t=0;
        for(int i=0;i<n;i++){
            t+=(arr[i]+(long)mid-1)/mid;
        }
        return t > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)t;
    }
    public int minEatingSpeed(int[] piles,int h){
        int max=Integer.MIN_VALUE;
        int n=piles.length;
        for (int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int s=1;
        int l=max;
        int result=max;

        while(s<=l){
            int mid=s+(l-s)/2;
            int time=helper(piles,mid,n);
            if(time<=h){
                result=mid;
                l=mid-1;
            } 
            else{
                s=mid+1;
            }
        }
        return result;
    }
}