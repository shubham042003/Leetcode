class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int b[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(c==n) break;
            if(arr[i]==0){
                for(int j=0;j<2;j++){
                    if(c==n) break;
                    b[c]=0;
                    c++;
                }
            }else{
                b[c]=arr[i];
                c++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=b[i];
        }
    }
}