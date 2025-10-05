class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr1){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int n=arr1.length;
        int c=0;
        int a[]=new int[n];
        for(int i:arr2){
            for(int j=0;j<h.get(i);j++){
                a[c]=i;
                c++;
            }
            h.remove(i);
        }
        Arrays.sort(arr1);
        if(h.size()>0){
            for(int i=0;i<n;i++){
                if(h.containsKey(arr1[i])){
                    a[c]=arr1[i];
                    c++;
                }
            }
        }
        return a;
    }
}