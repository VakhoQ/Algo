package algo.leetcode;

public class BuyStocks121 {

    /**
     * O(N)
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int maxProfit=0;
        for(int i=0; i<prices.length; i++){

            for(int j=i; j<prices.length; j++){

                int buy=prices[i];
                int sell=prices[j];

                if((-1)*buy+sell > maxProfit){
                    maxProfit = (-1)*buy+sell;
                }

            }
        }

        return maxProfit;
    }
}
