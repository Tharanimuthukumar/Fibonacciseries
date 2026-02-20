public class Fibonacci {

    // Recursive method
    static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide a number.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        int result = fib(n);

        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
