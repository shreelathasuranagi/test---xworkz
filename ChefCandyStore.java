// 8. Chef has started working in a candy store. The store has a total of 100 chocolates. 
// Chefs daily goal is to sell X chocolates. For each chocolate sold, he earns 1rupee. 
// However if chef exceeds his daily goal he earns 2 rupees for each extra chocolate sold beyond his goal. 
// Given that chef sells Y chocolates in a day calculate the total amount of money he made.


public class ChefCandyStore {

    public static void main(String[] args) {
        // Array of goals and chocolates sold each day
        int[] goal = {20, 30, 25}; // Chef's daily goal for 3 days
        int[] sold = {25, 35, 20}; // Chocolates Chef sold each day for 3 days
        
        int totalMoney = 0;

        // Loop through each day to calculate earnings
        for (int i = 0; i < goal.length; i++) {
            int X = goal[i];  // Goal for the day
            int Y = sold[i];  // Chocolates sold for the day

            if (Y <= X) {
                totalMoney += Y;  // Earn 1 rupee per chocolate if sold <= goal
            } else {
                totalMoney += X + 2 * (Y - X);  // Earn 1 rupee for goal, 2 rupees for extras
            }
        }

        System.out.println("Chef's total money earned over the days is: " + totalMoney + " rupees.");
    }
}
