public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        // Create a for statement using a range of numbers from 1 to 100 inclusive
        // Sum all the numbers that can be divided with both 3 and also with 5.
        // for those numbers that met the above conditions print out the number
        // Break out the loop once you find 5 numbers that met tha above conditions.
        // After breaking out of the loop print the sum of the numbers that met the above condition

        int count = 0;
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("fond the numbers = " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("sum of the number = " + sum);
    }
}



