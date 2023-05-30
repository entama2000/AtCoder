import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int ans = 0;
        for (int i = 1; i <= n && i < s; i++) {
            if (s - i >= n) {
                ans += n;
            } else {
                ans += s-i;
            }
        }
        System.out.println(ans);
    }
}