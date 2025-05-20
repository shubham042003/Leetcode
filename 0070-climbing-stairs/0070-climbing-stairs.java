class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 3;
        int a=2,b=3;
        for(int i=4;i<=n;i++){
            int s=a+b;
            a=b;
            b=s;
        }
        return b;
    }
}