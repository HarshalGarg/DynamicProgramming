/**
 *
 * @author harshal
 */
public class Knapsack {

    /**
     * @param args the command line arguments
     */
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("no of items");
        int n = 4;
       // System.out.println("capacity");
        int c = 5;
        int[][] dp = new int[n + 1][c + 1];
        int value[] = {0, 12, 10, 21, 15};
        int w[] = {999, 2, 1, 3, 2};
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (j - w[i] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = max(dp[i - 1][j - w[i]] + value[i], dp[i - 1][j]);
                }

            }

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(dp[i][j] + " ");

            }
            System.out.println("");
        }

    }
}
