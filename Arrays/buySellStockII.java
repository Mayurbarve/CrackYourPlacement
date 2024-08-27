//Best Time to Buy and Sell Stock II -122. 

public class buySellStockII {
    public static int buysell(int[] nums){
        int profit = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i -1]){
                profit += (nums[i] - nums[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println("Buy and Sell Stock II");
        int[] arr = { 7, 1, 5, 3, 6, 4 };

        System.out.println(buysell(arr));
    }
}
