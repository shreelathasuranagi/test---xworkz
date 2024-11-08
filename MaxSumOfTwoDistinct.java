// 3. You are given an array A of N integers, find the maximum sum of two distinct integers in the array.
// Note: It is guaranteed that there exist atleast two distinct integers in the array.

public class MaxSumOfTwoDistinct {

    public static void main(String[] args) {
        int[] A = {3,3, 5,5, 7, 2, 8, 8, 10}; // Example array with at least two distinct integers

        // Initialize max1 and max2 with the first two distinct elements
        int max1 = A[0];    //do not assign directly
        int max2 = A[1];
        
        // Ensure max1 is the larger of the two
        if (max2 > max1) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

        // Loop through the rest of the array
        for (int i = 2; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1; // Update second largest before updating the largest
                max1 = A[i];  // Update the largest
            } else if (A[i] > max2 && A[i] != max1) {
                max2 = A[i]; // Update second largest if it's distinct from the largest
            }
        }

        int maxSum = max1 + max2;
        System.out.println("The maximum sum of two distinct integers is: " + maxSum);
    }
}
