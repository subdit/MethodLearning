public class WhileDoWhile {
    public static void main(String[] args) {
        System.out.println(" *** while loop ***");
        int count = 0;
        while (count < 5) {
            System.out.println("Count value = " + count);
            count++;
        }
        System.out.println(" ******* another while loop *********");
        // Another While Loop
        count = 1;
        while (true) {
            if (count == 7) {
                break;
            }
            System.out.println("Count value is :: " + count);
            count++;
        }

        System.out.println(" **** for loop **** ");
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop value = " + i);
        }
        System.out.println(" ****** do while loop *********");
        count = 6;
        do {
            System.out.println("Count value was = " + count);
            count++;
            if (count > 10) {
                break;
            }
        } while (count != 6);

        System.out.println(" ********* While Loop even number ***********");
        //1.Create a method called isEvenNumber that takes a parameter of type int
        // It's purpose is to determine if the argument passed to the method is an even number or not.
        // Return true if an event number, otherwise return false.

        int number = 4; // assigned the start and finish number or range
        int finishNumber = 20;
        int sum = 0;
        while(number <= finishNumber){
            number++ ; // to stop the endless loop
            if(!isEventNumber(number)){
                continue;
            }
            System.out.println("Even number : " + number);
        }

        //Challenges
        // 2. Modify the while code above, Make it also record the total number of even number it has found
        // and break once 5 are found and at the end display the total number of even numbers found

        System.out.println(" ***** Second Challenge *********");

        int start = 0; // assigned the start and finish number or range
        int end = 20;
        int evenNumberFound = 0;

        while(start <= end){
            start++ ; // to stop the endless loop
            if(!isEventNumber(start)){
                continue;
            }
            System.out.println("Even number : " + start);
            evenNumberFound++;
            if(evenNumberFound >= 10){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumberFound);

    }
    public static boolean isEventNumber(int number) {
       if(number % 2 ==0){
           return true;
       }
       return false;
    }
}