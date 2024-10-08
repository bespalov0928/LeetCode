public class Solution {
    public int climbStairs(int n) {
        return run(0, n);
    }

    private int run(int step, int N) {
        if (step > N) {
            return 0;
        }
        if (step == N) {
            return 1;
        }
        return run(step + 1, N) + run(step + 2, N);
    }

    public int climbStairs_var2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairs_var3(int n) {
        int[] memo = new int[n + 1];
        return climbStairs_var3(n, memo);
    }

    private int climbStairs_var3(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = climbStairs_var3(n - 1, memo)
        + climbStairs_var3(n - 2, memo);
        return memo[n];
    }

}
