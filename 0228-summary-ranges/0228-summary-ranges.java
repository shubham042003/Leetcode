class Solution {
    public List<String> summaryRanges(int[] arr) {
        List<String> l=new ArrayList<>();
        int n=arr.length;
        int p=0;
        String w="";
        if (n == 0) return l;
        if (n == 1) {
            l.add("" + arr[0]);
            return l;
        }
        for(int i=0;i<n-1;i++){
            if(p==0){
                w=""+arr[i];
            }
            if(arr[i]+1 != arr[i+1] && p==0){
                l.add(w);
                w="";
            }
            if(arr[i]+1 != arr[i+1] && p!=0){
                w=w+"->"+arr[i];
                l.add(w);
                w="";
                p=0;
            }
            if(arr[i]+1==arr[i+1]){
                p++;
            }
        }
        if(p>0){
            w=w+"->"+arr[n-1];
            l.add(w);
        }
        else{
            l.add(""+arr[n-1]);
        }

        return l;
    }
}