//1.write a program to check whether X is present in array A
// Ex: array:[2,3,4,5,6]
// X:4
// Output: Yes

public class Array {

    public static void main(String[] args) {
        int[] numArr = {2, 3, 4, 5, 6};
        int x = 4;
        int i;

        // Loop through the array to find if x is present
        for (i = 0; i < numArr.length; i++) {
            if (numArr[i] == x) {
                System.out.println("Yes");
                return;
            }
        }

        // If the loop completes without finding x, print "No"
        System.out.println("No");
    }
}
