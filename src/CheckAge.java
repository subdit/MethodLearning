import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CheckAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        checkAge(21);


    }

    static void checkAge(int age){
        if(age < 18) {
            System.out.println("Access denied");
        }else {
            System.out.println("Access Granted!");
        }

        }
        public class MyClass{
        int x = 5;
        MyClass myObj = new MyClass();


    }
}
