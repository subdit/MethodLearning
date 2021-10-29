public class Breaks {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            if(i == 8){
                continue;
            }
            System.out.println("Number is : " + i);
        }
        String [] cars = {"BMW", "Volvo", "Toyota", "Ford"};
        cars [0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("****** For Each method **********");
        for(String i : cars){
            System.out.println(i);
        }
        int [] number = {1,2,3,4,5,6};
        for (int i: number) {
            System.out.println(i);

        }
        System.out.println("Multidimensional Array");
        int [] [] myNumbers = {{1,2,3,4}, {5,6,7}};
        int x = myNumbers[0][2];
        System.out.println(x);
    }
}
