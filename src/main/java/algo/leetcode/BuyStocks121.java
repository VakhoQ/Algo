package algo.leetcode;

public class BuyStocks121 {

    /**
     * Time complexity is O(n)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int largestDifference=0;
        int minSoFar = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if (prices[i]< minSoFar){
                minSoFar=prices[i];
            }{
                // if price[i] is not the minimum so far ==> let's see what' largest difference
                int profit = -1*(minSoFar)+prices[i];
                largestDifference=Math.max(largestDifference, profit );
            }

        }
        return largestDifference;
    }


    /**
     * O(n^2)
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
     * @param prices
     * @return
     */
    public int maxProfitN2(int[] prices) {

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
