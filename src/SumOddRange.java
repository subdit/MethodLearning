public class SumOddRange {
    public static void main(String[] args) {
    // Running method here.
        System.out.println( isOdd(-5));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, 1000));
    }
    public static boolean isOdd(int number) {

        if(number <=0){
            return false;
        }return number %2 ==1;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if((end < start) || (end < 0) || (start < 0)){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
}