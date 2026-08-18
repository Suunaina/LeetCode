class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        int ans = dp[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int cur = nums[0];
//         int max = nums[0];
//         for(int i=1 ; i<nums.length ; i++){
//             cur = Math.max(nums[i] , cur+nums[i]);

//             if(cur > max){
//                 max = cur;
//             }
//         }
//         return max;
//     }
// }