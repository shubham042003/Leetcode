class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=n*-1;
            x=1/x;
        }
        double r=1;
        while(n!=0){
            if(n%2!=0){
                r=r*x;
            }
            x=x*x;
            n=n/2;
        }
        return r;
    }
}