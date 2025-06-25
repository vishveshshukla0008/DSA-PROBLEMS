public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        // Approach :
        // 1. Calculate the buying price for each price array :

        int buyPrice[] = new int[prices.length];

        // 2. Initialize the initial value of 0th index for buyPrice is maximum bcz no
        // other day before this :
        buyPrice[0] = Integer.MAX_VALUE;

        // 3. Calculate Min from previous index of buyPrice(i-1) and previous index of
        // prices(i-1)
        for (int i = 1; i < buyPrice.length; i++) {
            buyPrice[i] = Math.min(prices[i - 1], buyPrice[i - 1]);
        }

        // 4.

        int maxProfit = 0;
        for (int i = 0; i < buyPrice.length; i++) {
            int currProfit = prices[i] - buyPrice[i];
            maxProfit = Math.max(currProfit, maxProfit);
        }

        if (maxProfit < 0) {
            maxProfit = 0;
        }

        System.out.println(maxProfit);

    }
}
