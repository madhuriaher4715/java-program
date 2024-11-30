public class lec1 {
    static int sumofdigit(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumofdigit(n / 10);
        }
    }

    public static void main(String[] args) {
        int num = 1234;
        int sum = sumofdigit(num);
        System.out.println("addition of digit" + sum);
    }

}