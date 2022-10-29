typedef long long ll;

class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<ll>> dp(m, vector<ll>(n, 0));
        for(int i = 0;i<m;i++) {
            dp[i][0] = 1;
        }
        for(int i =0;i <n;i++) {
            dp[0][i] = 1;
        }
        
        for(int i =1;i<m;i++) {
            for(int j=1;j<n;j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
};
