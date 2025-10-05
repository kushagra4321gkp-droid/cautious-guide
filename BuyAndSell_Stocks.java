public class BuyAndSell_Stocks {

    public static int maximumProfit(int prices[]){
        int bp = prices[0];
        int sp = 0;
        int profit = 0;
        int max_profit = 0;
        for(int i = 1; i<prices.length; i++){
            sp = prices[i];
            if(prices[i-1] < bp){
                bp = prices[i-1];
            }
            profit = sp - bp;
            if(profit > max_profit){
                max_profit = profit;
            }
        }
        if(max_profit <= 0){
                return 0;
            }
        return max_profit;
    }

    public static void main(String[] args) {
        // int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {2, 1, 4};

        System.out.print("maximum profit is : " + maximumProfit(prices));
    }
}