class Solution {
    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        return solve(n);
    }

    public int solve(int n) {//this function is to return if the value is already calculated
        if (n <= 3) return n;

        if (dp[n] != 0)
            return dp[n];

        dp[n] = solve(n - 1) + solve(n - 2);

        return dp[n];
    }
}


// class Solution {
//     public int climbStairs(int n) {
//         if (n <= 2) return n;

//         int oneStepBefore = 2;
//         int twoStepsBefore = 1;

//         for (int i = 3; i <= n; i++) {
//             int current = oneStepBefore + twoStepsBefore;
//             twoStepsBefore = oneStepBefore;
//             oneStepBefore = current;
//         }

//         return oneStepBefore;
//     }
// }