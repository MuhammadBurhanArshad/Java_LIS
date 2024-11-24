public class LIS {
    public int findLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = dp[i] > dp[j] + 1 ? dp[i] : dp[j] + 1;
                }
            }
        }

        int maxLIS = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > maxLIS) {
                maxLIS = dp[i];
            }
        }

        return maxLIS;
    }
}
