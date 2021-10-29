import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        System.out.println("Your number is: " + number);
    }
}
