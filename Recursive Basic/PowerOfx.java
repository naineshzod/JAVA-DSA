public class PowerOfx {
    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Power(x, n - 1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println("The value of " + x + " raised to the power of " + n + " is: " + Power(x, n));
    }

}
