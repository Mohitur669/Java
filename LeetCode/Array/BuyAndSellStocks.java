public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int price : prices) {
            if (price < lsf) {
                lsf = price;
            }
            pist = price - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }
}