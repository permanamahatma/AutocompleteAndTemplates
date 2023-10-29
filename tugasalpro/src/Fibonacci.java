public class Fibonacci {

    public static long recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // Implementasi iteratif Fibonacci
    public static long iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fib = 0;
        long prev = 1;
        long prevprev = 0;

        for (int i = 2; i <= n; i++) {
            fib = prev + prevprev;
            prevprev = prev;
            prev = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int[] values = {100, 200, 300, 1000};

        for (int n : values) {
            long startTime = System.currentTimeMillis();
            long resultRecursive = recursiveFibonacci(n);
            long endTime = System.currentTimeMillis();
            System.out.println("n = " + n + " (rekursif) --> " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();
            long resultIterative = iterativeFibonacci(n);
            endTime = System.currentTimeMillis();
            System.out.println("n = " + n + " (iteratif) --> " + (endTime - startTime) + " ms");
        }
    }
}


