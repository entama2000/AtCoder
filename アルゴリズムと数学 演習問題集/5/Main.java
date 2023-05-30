import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += scan.nextInt();
            ans %= 100;
        }
        System.out.println(ans);
    }
}