class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=arr[n-1];
        int a[]=new int[n];
        if(n==1){
            a[n-1]=-1;
            return a;
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                a[i]=max;
                max=arr[i];
            }else{
                a[i]=max;
            }
        }
        a[n-1]=-1;
        return a;
    }
}