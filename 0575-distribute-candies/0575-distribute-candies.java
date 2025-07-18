class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> s=new HashSet<>();
        int n=candyType.length;
        int candies=n/2;
        for(int i=0;i<n;i++){
            s.add(candyType[i]);
        }
        int m=s.size();
        if(m<=candies) return m;
        else return candies;
    }
}