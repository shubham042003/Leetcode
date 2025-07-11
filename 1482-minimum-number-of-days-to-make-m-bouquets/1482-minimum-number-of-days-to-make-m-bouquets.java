class Solution {
    public int totalBouquets(int arr[],int day,int m,int k){
        int c=0;
        int tBouquet=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                c++;
                if(c==k){
                    tBouquet++;
                    c=0;
                }
            } 
            else{
                c=0;
            }
        }
        return tBouquet;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if ((long) m * k > n) return -1;
        int left=Arrays.stream(bloomDay).min().getAsInt();
        int right=Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int bouquets=totalBouquets(bloomDay,mid,m,k);
            if(bouquets>=m){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}