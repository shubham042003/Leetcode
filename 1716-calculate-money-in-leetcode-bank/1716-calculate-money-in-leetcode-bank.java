class Solution {
    public int totalMoney(int n) {
        int c=0,j=1,sum=0;
        for(int i=1;i<=n;i++){
            sum+=c+j;
            j++;
            if(i%7==0){
                c++;
                j=1;
            }
        }
        return sum;
    }
}