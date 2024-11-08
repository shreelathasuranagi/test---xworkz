// 7. You are given an integer N. Write a program to calculate the sum of all the digits of N.

public class SumOfDigits {

    public static void main(String[] args) {
        int N = 12345; // Example integer

        // Convert the number N to a string to extract each digit
        String numberStr = Integer.toString(N);

        // Create an array to store the digits of the number
        int[] digits = new int[numberStr.length()];

        // Fill the array with digits
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        // Calculate the sum of the digits
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        System.out.println("The sum of the digits of " + N + " is: " + sum);
    }
}
