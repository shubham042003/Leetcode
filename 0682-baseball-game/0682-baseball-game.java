class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            char c=operations[i].charAt(0);
            if(c=='C'){
                a[j-1]=0;
                j--;
            }
            else if(c=='D'){
                a[j]=2*a[j-1];
                j++;
            }
            else if(c=='+'){
                a[j]=a[j-1]+a[j-2];
                j++;
            }
            else {
                a[j]=Integer.parseInt(operations[i]);
                j++;
            }
        }
        int sum=0;
        for(int i=0;i<j;i++){
            sum+=a[i];
        }
        return sum;
    }
}