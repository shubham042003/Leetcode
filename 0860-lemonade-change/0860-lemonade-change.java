class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                h.put(bills[i], h.getOrDefault(bills[i], 0) + 1);
            }
            else if(bills[i]==10){
                h.put(bills[i], h.getOrDefault(bills[i], 0) + 1);

                if(h.getOrDefault(5, 0)>0){
                    h.put(5,h.get(5)-1);
                }
                else{
                    return false;
                }
            }
            else{
                h.put(bills[i], h.getOrDefault(bills[i], 0) + 1);

                if(h.getOrDefault(5, 0)>0 && h.getOrDefault(10, 0)>0){
                    h.put(5,h.get(5)-1);
                    h.put(10,h.get(10)-1);
                }
                else if(h.getOrDefault(5, 0)>=3){
                    h.put(5,h.get(5)-3);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}