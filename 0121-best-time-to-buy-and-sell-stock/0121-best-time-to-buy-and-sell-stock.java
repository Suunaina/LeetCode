class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max = 0;
        int buy = prices[0];
        for(int i=1 ; i<len ; i++){
            int cur = prices[i] - buy;
            if(cur > max){
                max = cur;
            }

            if(prices[i] < buy){
                buy = prices[i];
            }
        }
        return max;
    }
}