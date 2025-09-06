class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int ts=0,c=0,l=0;
        int arr[]=new int[3];
        Arrays.fill(arr,0);
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            arr[ch-'a']++;
            if(arr[ch-'a']==1){
                c++;
            }
            while(c==3){
                ts+=n-r;
                char ch1=s.charAt(l);
                arr[ch1-'a']--;
                if(arr[ch1-'a']==0){
                    c--;
                }
                l++;
            }
        }
        return ts;
    }
}