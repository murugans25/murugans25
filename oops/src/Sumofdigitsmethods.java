
public class Sumofdigitsmethods {

     // Method to calculate the sum of digits
    static int findSumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 100; // Get the last digit
            sum += digit; // Add it to sum
            number = number /10 ; // Remove last digit
        }

        return sum; // Return the sum of digits
    }

    public static void main(String[] args) {
        // Calling the method with different numbers
        System.out.println( findSumOfDigits(123)); // 1+2+3 = 6
        System.out.println("Sum of digits of 4567: " + findSumOfDigits(4567)); // 4+5+6+7 = 22
        System.out.println("Sum of digits of 89: " + findSumOfDigits(89)); // 8+9 = 17
        System.out.println("Sum of digits of 90806: " + findSumOfDigits(90806)); // 9+0+8+0+6 = 23
    }
}

