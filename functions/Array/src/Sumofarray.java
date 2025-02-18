public class Sumofarray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Sample array
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int num : numbers) {
            sum+= num;
        }

        // Print the result
        System.out.println("Sum of array elements: " + sum);
    }
}
