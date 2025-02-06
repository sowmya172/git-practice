public class demo060 {
    public static void main(String[] args) {
        int n = 20; // Number of Fibonacci numbers to print
        int[] fibonacci = new int[n];

        // First two Fibonacci numbers
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculate the Fibonacci series
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the Fibonacci series
        System.out.println("Fibonacci Series of " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}