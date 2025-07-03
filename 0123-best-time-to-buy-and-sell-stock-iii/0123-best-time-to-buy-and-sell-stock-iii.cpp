class Solution {
public:
    int f(int i, int buy, int t, vector<int>& prices, vector<vector<vector<int>>>& dp) {
        if (i == prices.size() || t == 0)
            return 0;

        if (dp[i][buy][t] != -1)
            return dp[i][buy][t];

        int profit = 0;
        if (buy) {
            profit = max(-prices[i] + f(i + 1, 0, t, prices, dp),
                         0 + f(i + 1, 1, t, prices, dp));
        } else {
            profit = max(prices[i] + f(i + 1, 1, t - 1, prices, dp),
                         0 + f(i + 1, 0, t, prices, dp));
        }
        return dp[i][buy][t] = profit;
    }

    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        vector<vector<vector<int>>> dp(n, vector<vector<int>>(2, vector<int>(3, -1)));
        return f(0, 1, 2, prices, dp);
    }
};
