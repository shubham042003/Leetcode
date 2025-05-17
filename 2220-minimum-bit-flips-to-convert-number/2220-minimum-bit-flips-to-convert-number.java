class Solution {
    public int minBitFlips(int start, int goal) {
        int a=start^goal;
        int c=0;
        while(a!=0){
            int d=a%2;
            if(d==1) c++;
            a=a>>1;
        }
        return c;
    }
}