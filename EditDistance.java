import java.util.*;

/**
 *
 * @author harshal
 */
public class EditDistance {

   
    static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else {
            if (b < a && b < c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();  //target string
        String s2 = sc.next();   //given string
        int l1 = s1.length();
        int l2 = s2.length();
        int a = 5;//addition cost
        int d = 7;//deletion cost
        int r = 10;//replace cost
        int[][] dp = new int[l2 + 1][l1 + 1];
        for (int i = 0; i <= l1; i++) {
            dp[0][i] = i * a;
        }
        for (int i = 0; i <= l2; i++) {
            dp[i][0] = i * d;
        }
        for (int i = 1; i <= l2; i++) {
            for (int j = 1; j <= l1; j++) {
                if (s2.charAt(i - 1) == s1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = min(dp[i - 1][j] + d, dp[i][j - 1] + a, dp[i - 1][j - 1] + r);

                }
            }

        }
        System.out.println(dp[l2][l1]);
    }

}
