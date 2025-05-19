class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s =new HashSet<>();
        Set<Integer> result =new HashSet<>();
        int n =nums1.length;
        int m =nums2.length;
        for(int i=0;i<n;i++) {
            s.add(nums1[i]);
        }
        for(int i=0;i<m;i++) {
            if (s.contains(nums2[i])) {
                result.add(nums2[i]); 
            }
        }
        int c=0;
        int a[]=new int[result.size()];
        for(int num:result) {
            a[c]=num;
            c++;
        }
        return a;
    }
}