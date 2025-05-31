class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        if(n!=m) return false;
        // char c=goal.charAt(0);
        // for(int i=0;i<n;i++){
        //     char d=s.charAt(i);
        //     if(d==c){
        //         s=s.substring(i,n)+s.substring(0,i);
        //         break;
        //     }
        // }
        // if(s.equals(goal)) return true;
        // return false;
        return (s+s).contains(goal);
    }
}