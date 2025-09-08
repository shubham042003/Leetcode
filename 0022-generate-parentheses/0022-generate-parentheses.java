class Solution {
    public void generate(List<String> r,int max,int open,int close,String w){
        if(w.length()==(2*max)){
            r.add(w);
            return;
        }
        if(open<max){
            generate(r,max,open+1,close,w+"(");
        }
        if(close<open){
            generate(r,max,open,close+1,w+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> r=new ArrayList<>();
        generate(r,n,0,0,"");
        return r;
    }
}