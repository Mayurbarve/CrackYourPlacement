// Best time to buy and sell stock : leetCde- 121

public class buySellStock {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else{
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println("Best time to buy and sell stock");
        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }
}