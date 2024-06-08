public class P12_1 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int sell = 1; sell < prices.length; sell++) {
            if (buy > prices[sell]) {
                buy = prices[sell];
            } else {
                profit = Math.max(profit, prices[sell] - buy);
            }
        }
        return profit;
    }
}
