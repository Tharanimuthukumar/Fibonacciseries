public class Fibonacci {

    // Recursive Method
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide n value");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("n must be non-negative");
            return;
        }

        int result = fib(n);

        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
