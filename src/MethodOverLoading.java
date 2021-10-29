public class MethodOverLoading {
    public static void main(String[] args) {
//        calculateScore("Tim",400);
        calcFeetAndInchesToCentimeters(7, 4);
        double centimeters = calcFeetAndInchesToCentimeters(1, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid centimeters parameter");
        }
        calcFeetAndInchesToCentimeters(156);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // To check the parameter out of range
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm.");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}










//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player Name: " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore(int score) {
//        System.out.println("Unknown player name: " + " scored " + score + " points");
//        return score * 1000;
//    }
//}
