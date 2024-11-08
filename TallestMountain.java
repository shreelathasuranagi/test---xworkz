// 2. Given a list of N integers, representing height of mountains.
// Find the height of the tallest mountain.

public class TallestMountain {

    public static void main(String[] args) {
        int[] heights = {1200, 850, 950, 1100, 1250}; // Example heights of mountains

        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        System.out.println("The height of the tallest mountain is: " + tallest);
    }
}
