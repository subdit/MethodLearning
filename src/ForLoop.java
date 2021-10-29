public class ForLoop {
    public static void main(String[] args) {

        for(int number = 100; number < 130; number += 10){
            System.out.println("number = " + number);
        }

        System.out.println("The 10,000 at 0.2% rate interest =  " + calculateInterest(10000.00, 2));

//        for(initialize one; termination when it false; increment involve the code for how many times?){
//        }
        // Using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interest rate of 2,3,4,5,6,7, and 8,
        // and print the result to the console window.

        for (double i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double) i)));
        }
        System.out.println("===========================");
        for (double i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double) i)));
        }

        System.out.println("============ isPrime ==============");
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out And increment a count of the number of prime numbers found
        // hint: Use the break statement to exit
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 5) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        // prime technique using n/2 to save time.
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
