public class NumberPalindrome {
    public static void main(String[] args) {
isPalindrome(1200);
        System.out.println("Is it a palindrome number : " + isPalindrome(112211));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int origin = number;
        while(number > 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number/= 10;
        }
        return origin == reverse;
    }
}
