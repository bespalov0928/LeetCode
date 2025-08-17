public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int index = 0; index < prices.length; index++) {
            minPrice = Math.min(prices[index], minPrice);
            profit = Math.max(prices[index] - minPrice, profit);
        }
        return profit;
    }

    private int INF = Integer.MAX_VALUE;

    public int maxProfit_var2(int[] prices) {
//        var cache = new int[prices.length][1];
//        var rsl = test(prices, 0);
//        var rsl = 0;
        var cache = initCash(prices.length);
        var rsl = run(prices, 0, 0, cache);
        return rsl;
    }

    private int test(int[] prices, int index) {
//        cache[index][0] = prices[index];
//        System.out.println(prices[index]);
        if (index == prices.length - 1) {
            return prices[index];
        }
        var maxVal = Math.min(prices[index], test(prices, index + 1));
//        System.out.println(x);
//        return -1;
        return maxVal;
    }

    private int[][] initCash(int N) {
        var ans = new int[N][];
        for (int i = 0; i < N; i++) {
            ans[i] = new int[]{-1, -1};
        }
        return ans;
    }

    private int run(int[] prices, int idx, int seen, int[][] cache) {
        int N = prices.length;

        //купили и не продали
        if (idx == N && seen == 1) {
//            return prices[idx];
            return -INF;
        }

        //не купили и не продали
        if (idx == N && seen == 0) {
            return 0;
        }

        //кэш
        if (cache[idx][seen] != -1) {
            return cache[idx][seen];
        }

        //если мы где-то купили то можем продать
        if (seen == 1) {
//            var x1 = prices[idx];
//            var x2 = run(prices, idx + 1, seen, cache);
            //продаю или дальше иду
//            cache[idx][seen] = Math.max(x1, x2);
            cache[idx][seen] = Math.max(prices[idx], run(prices, idx + 1, seen, cache));
            return cache[idx][seen];
        }
//        var z1 = -prices[idx];
//        //уже видел операцию покупки seen = true
//        var z2 = run(prices, idx + 1, 1, cache);
//        //иду дальше смотрю что купить seen = false
//        var z3 = run(prices, idx + 1, 0, cache);
        ////покупаю или дальше иду
//        cache[idx][seen] = Math.max(-z1 + z2, z3);
        cache[idx][seen] = Math.max(-prices[idx]
                        + run(prices, idx + 1, 1, cache)
                , run(prices, idx + 1, 0, cache));
        return cache[idx][seen];
    }
}