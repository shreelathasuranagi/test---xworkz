// 5. Write a program to find the remainder when an integer A is divided by an integer B.
public class Remainder {

    public static void main(String[] args) {
        // Arrays to store multiple values of A and B
        int[] A = {17, 25, 100}; // Example values for A
        int[] B = {5, 7, 3};     // Example values for B

        // Check that both arrays have the same length
        if (A.length == B.length) {
            // Loop through each pair of A and B
            for (int i = 0; i < A.length; i++) {
                int remainder = A[i] % B[i];  // Find the remainder for each pair
                System.out.println("The remainder when " + A[i] + " is divided by " + B[i] + " is: " + remainder);
            }
        } else {
            System.out.println("Arrays A and B must have the same length.");
        }
    }
}

