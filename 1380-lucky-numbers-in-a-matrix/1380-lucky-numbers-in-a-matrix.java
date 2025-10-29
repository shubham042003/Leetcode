class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                min=Math.min(min,matrix[i][j]);
            }
            h.put(min,h.getOrDefault(min,0)+1);
            min=Integer.MAX_VALUE;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,matrix[j][i]);
            }
            h.put(max,h.getOrDefault(max,0)+1);
            max=Integer.MIN_VALUE;
        }

        for(int k:h.keySet()){
            if(h.get(k)>1){
                l.add(k);
            }
        }
        return l;
    }
}