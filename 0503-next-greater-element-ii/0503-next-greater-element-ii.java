class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        Arrays.fill(a,-1);
        Stack<Integer> s=new Stack<>(); 

        for (int i=0;i<2*n;i++){
            int idx=i%n;
            while(!s.isEmpty() && nums[s.peek()] < nums[idx]) {
                a[s.pop()]=nums[idx];
            }
            if(i<n){
                s.push(idx);
            }
        }
        return a;
    }
}