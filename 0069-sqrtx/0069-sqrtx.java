class Solution {
    public int mySqrt(int x) {
        // return (int)Math.pow(x,0.5);
        int s=1;
        int l=x;
        int r=0;
        while(s<=l){
            int m=s+(l-s)/2;
            if(m<=x/m){
                r=m;
                s=m+1;
            }else{
                l=m-1;
            } 
        }
        return r;
    }
}