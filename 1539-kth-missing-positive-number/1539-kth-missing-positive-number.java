class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int value=0;
        int i=1,j=0;
        int n=arr.length;
        while(count!=k && j<n){
            if(i!=arr[j]){
                count++;
                value=i;
                i++;
            }
            else{
                j++;
                i++;
            }
        }
        if(count!=k){
            return i+(k-count-1);
        }
        return value;
    }
}