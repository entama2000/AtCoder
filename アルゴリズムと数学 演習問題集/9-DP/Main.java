import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        boolean dp[] = new boolean[s + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            for (int j = s - num; j >= 0; j--) {
                dp[j + num] |= dp[j];
            }
        }
        System.out.println(dp[s] ? "Yes" : "No");
    }
}