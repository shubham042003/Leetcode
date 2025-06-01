class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> a=new HashSet<>();
        int max=0;
        int start=0;
        int end=0;
        while(end<n){
            char ch=s.charAt(end);
            if(!a.contains(ch)){
                a.add(ch);
                max =Math.max(max, end-start+1);
                end++;
            } 
            else{
                a.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}