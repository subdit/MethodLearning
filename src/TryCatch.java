import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
//        int a[] = new int[2];
//        try{
//            System.out.println("Access element three : " + a[4]);
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown : " + e);
//        }finally {
//            a[0] = 6;
//            System.out.println("The Second element value: " + a[0]);
//            System.out.println("The finally statement is executed");
//        }


        // Create two integers x and y as input, you have to compute x/y, if x and y are not 32-bit
        // signed integer or if y is zero, exception will occur, and you have to report it.
        // Read sample input/output to know what to report in case of exceptions.


        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter x: ");
            int x = scan.nextInt(10);
            scan.nextLine();
            System.out.println("Enter y: ");
            int y = scan.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e){
            System.out.println(e.getClass().toString().replaceFirst("class ", " "));
        } catch (ArithmeticException e){
            //Print exception
            System.out.println(e);
        }
            scan.close();
    }
}
