import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                sum++;
            } else if (i % y == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}