class Solution {
    public int maxWeightCell(int[] exits) {
        int [] weight = new int [exits.length];
        for(int i=0; i<weight.length; i++){
            if(exits[i]!=-1)weight[exits[i]] += i;
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<weight.length; i++){
            if(weight[i]>= max){
                max = weight[i];
                ans = i;
            }
        }
        return ans;
    }
}
