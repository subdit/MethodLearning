public class SwitchStatement {

    public static void main(String[] args) {

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
        }
        // create a new switch statement using char instead of int
        // create a new char variable
        // create a Switch statement testing for A, B, C, D or E
        // display a message if any of these are found and then break
        // add a default which displays a message saying not found

        char charValue = 'D';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            default:
                System.out.println("Could not find A, B, C or D");
        }
    }
}
