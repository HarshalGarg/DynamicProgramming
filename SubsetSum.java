/**
 *
 * @author harshal
 */
public class SubsetSum { //problem -it is possible to make the given sum from givean array of numbers

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        // System.out.println("capacity");
        int sum = 14;
        int[][] dp = new int[n + 1][sum + 1];
        int a[] = {5, 2, 1, 3, 2};
        for (int i = 1; i <= n; i++) {
            dp[i][a[i-1]] = 1;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - a[i-1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    if ((dp[i - 1][j] == 1) || (dp[i - 1][j - a[i-1]] == 1)) {
                        dp[i][j] = 1;
                    }
                }

            }

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                System.out.print(dp[i][j] + " ");

            }
            System.out.println("");

        }

    }
}
