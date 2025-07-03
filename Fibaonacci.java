public class Fibaonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        int result = fibonacci(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}