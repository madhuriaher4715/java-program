public class lecture6 {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sum(n / 10);
        }
    }

    public static void main(String[] args) {
        int num = 12345;
        int sum = sum(num);
        System.out.println(sum);
    }
}