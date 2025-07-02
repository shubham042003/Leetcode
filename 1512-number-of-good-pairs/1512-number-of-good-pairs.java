class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int c=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             c++;
        //         }
        //     }
        // }
        // return c;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<n;i++){
            if(a.containsKey(nums[i])){
                c+=a.get(nums[i]);
                a.put(nums[i],a.get(nums[i])+1);
            }
            else{
                a.put(nums[i],1);
            }
        }
        return c;
    }
}