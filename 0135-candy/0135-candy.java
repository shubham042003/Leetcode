class Solution {
    public int candy(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        int s=0;
        Arrays.fill(b,1);
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                b[i]=b[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(a[i]>a[i+1]){
                b[i]=Math.max(b[i], b[i + 1] + 1);
            }
        }
        for(int i=0;i<n;i++){
            s=s+b[i];
        }
        return s;
    }
}