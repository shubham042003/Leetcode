class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int sum=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(i+1<n && h.get(c)<h.get(s.charAt(i+1))){
                sum-=h.get(c);
            }else{
                sum+=h.get(c);
            }
        }
        return sum;
    }
}