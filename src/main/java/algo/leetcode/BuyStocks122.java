package algo.leetcode;

public class BuyStocks122 {

    public int maxProfit(int[] prices) {
        int total =0;
        for(int i=1; i < prices.length; i++){
            int profit = -1*prices[i-1]+prices[i];
            if(profit>0){
                total+=profit;
            }
        }
        return total;
    }
}
