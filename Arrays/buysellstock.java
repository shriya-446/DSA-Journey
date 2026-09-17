class Solution {
    public int maxProfit(int[] arr) {

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            int profit = arr[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
        }

        return maxProfit;
    }
}
