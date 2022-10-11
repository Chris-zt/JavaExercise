/**
 * 作者： chris
 * 时间:  2022-08-16
 */
public class t122 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1])
                ans += (prices[i] - prices[i-1]);
        }
        return ans;
    }
}
