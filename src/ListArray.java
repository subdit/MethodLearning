import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ListArray {
    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Toyota");
//        cars.add("Opel");
//        System.out.println(cars);
//        cars.set(2, "Mazda");
//        System.out.println(cars);
//        cars.remove(3);
//        System.out.println(cars);
//        cars.size();
//        System.out.println(cars.size());
//
//        cars.add("Honda");
//        for(String i: cars){
//            System.out.println(i);
//        }
//        for(int i = 0; i < cars.size(); i++){
//            System.out.println(cars.get(i));
//        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(2);
        myNumbers.add(4);
        myNumbers.add(6);
        myNumbers.add(8);
        myNumbers.set(0, 10);

        System.out.println(myNumbers.get(2));
        System.out.println("============get second element ========");

        Collections.sort(myNumbers); // sort myNumbers..
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}