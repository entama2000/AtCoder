import java.util.*;



class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long ans = fuct(n);
        System.out.println(ans);
    }
    public static long fuct(long n) {
        if (n == 0) { return 1; }
        return n * fuct(n - 1);
    }
}