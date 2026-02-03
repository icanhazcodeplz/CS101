
public class remainder {
    public static void main(String[] args) {
        // Basic modulo examples
        System.out.println("10 % 3 = " + (10 % 3));  // 1 (10 divided by 3 leaves remainder 1)
        System.out.println("15 % 5 = " + (15 % 5));  // 0 (15 divides evenly by 5)
        System.out.println("7 % 2 = " + (7 % 2));    // 1 (odd number % 2 is always 1)
        System.out.println("8 % 2 = " + (8 % 2));    // 0 (even number % 2 is always 0)

        // Practical use: checking if a number is even or odd
        int num = 17;
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        // Practical use: printing a status update every ten iterations
        int numIterations = 50;
        int printEvery = 10;

        for (int i = 1; i <= numIterations; i++) {
            // Do some operation every iteration
            System.out.println("Processed " + i + " items");

            if (i % printEvery == 0) {
                System.out.println("Processed " + i + " items");
            }
        }
    }
}
