class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n2=nums2.length;
        int n1=nums1.length;
        int a[]=new int[n2];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n1;i++){
            h.put(nums1[i],i);
        }
        for(int i=n2-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                a[i]=-1;
            }else{
                a[i]=s.peek();
            }
            s.push(nums2[i]);
        }
        for(int i=0;i<n2;i++){
            if(h.containsKey(nums2[i])){
                nums1[h.get(nums2[i])]=a[i];
            }
        }
        return nums1;
    }
}