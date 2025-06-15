class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int cs=0,cl=n-1,rs=0,rl=m-1;
        while(cs<=cl && rs<=rl){
            for (int i =cs;i<=cl;i++){
                a.add(matrix[rs][i]);
            }
            rs++;

            for(int i=rs;i<=rl;i++){
                a.add(matrix[i][cl]);
            }
            cl--;

            if(rs<=rl){
                for(int i=cl;i>=cs;i--){
                    a.add(matrix[rl][i]);
                }
                rl--;
            }

            if(cs<=cl){
                for(int i=rl;i>=rs;i--){
                    a.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return a;
    }
}