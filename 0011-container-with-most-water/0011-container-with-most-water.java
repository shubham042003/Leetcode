class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int min=Math.min(height[l],height[r]);
            int p=min * (r-l);
            max=Math.max(p,max);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}