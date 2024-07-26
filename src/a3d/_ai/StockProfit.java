package a3d._ai;

public class StockProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int min_price = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if the current price is lower
            if (prices[i] < min_price) {
                min_price = prices[i];
            } else {
                // Calculate the profit if sold at current price
                int profit = prices[i] - min_price;
                // Update max_profit if the current profit is greater
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " + maxProfit(prices));  // Output: 5
    }
}

class StockProfitCopy {
    public static void main(String[] args) {
        int[] prices = {7, 5, 3, 6, 8, 1};
        int max_profit = 0;
        int min_value = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_value) {
                min_value = prices[i];
            } else {
                int profit = prices[i] - min_value;
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }
        System.out.println(max_profit);
    }
}