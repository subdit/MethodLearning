import java.util.Scanner;

public class ScannerInputOutPut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = sc.hasNextInt(); // To check the next input

        if(hasNextInt){
            int yearOfBirth = sc.nextInt();
            sc.nextLine(); // To handle next line not to skip

            System.out.println("Please enter you name: ");
            String name = sc.nextLine();
            int age = (2021 - yearOfBirth);

            if(age >= 0 && age <= 200){
                System.out.println("Hi " + name + " ,you are " + age + " years old today!");
            }else {
                System.out.println("Invalid years of birth");
            }
        }else {
            System.out.println("Unable to parse years of birth, Please enter integer! ");
        }
        sc.close();
    }
}
