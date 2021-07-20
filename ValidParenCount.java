public class ValidParenCount {
    public static void main(String[] args) {
        int n = 4;
        int dp [] = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            int inside = i-1;
            int outside = 0;

            while(inside >= 0) {
                dp[i] += dp[inside] * dp[outside];
                inside--;
                outside++;
            }
        }
        System.out.println(dp[n]);
    }
}
