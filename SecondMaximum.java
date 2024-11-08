// 9. Write a program, that accepts sets of three numbers and prints the second maximum among the three

public class SecondMaximum {

    public static void main(String[] args) {
        // Declare an array to store the three numbers
        int[] numbers = {5, 8, 3}; // Example input for 3 numbers

        // Sort the array in ascending order
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    // Swap the elements
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // The second maximum will be the second last element in the sorted array
        int secondMax = numbers[numbers.length - 2];

        // Output the second maximum number
        System.out.println("The second maximum number is: " + secondMax);
    }
}
