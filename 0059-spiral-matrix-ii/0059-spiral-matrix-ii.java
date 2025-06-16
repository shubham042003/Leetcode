class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int cs=0,cl=n-1,rs=0,rl=n-1;
        int c=1;
        while(cs<=cl && rs<=rl){
            for (int i =cs;i<=cl;i++){
                matrix[rs][i]=c;
                c++;
            }
            rs++;

            for(int i=rs;i<=rl;i++){
                matrix[i][cl]=c;
                c++;
            }
            cl--;

            if(rs<=rl){
                for(int i=cl;i>=cs;i--){
                    matrix[rl][i]=c;
                    c++;
                }
                rl--;
            }

            if(cs<=cl){
                for(int i=rl;i>=rs;i--){
                    matrix[i][cs]=c;
                    c++;
                }
                cs++;
            }
        }
        return matrix;
    }
}