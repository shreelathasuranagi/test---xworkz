// 10. Alice, Bob, and Charlie participated in a 400 meter race. 
// The time taken by Alice, Bob, and Charlie to complete the race was X, Y, and Z seconds respectively. 
// Note that X, Y, and Z are distinct. Determine who had the highest average speed in the race.

public class Race {

    public static void main(String[] args) {
        // Array to store times for Alice, Bob, and Charlie
        int[] times = {50, 45, 55}; // Example: times taken by Alice, Bob, and Charlie  
        //supposed to take speed

        // Array of participant names for easy identification
        String[] names = {"Alice", "Bob", "Charlie"};

        // Assume the first participant has the smallest time initially
        int minTime = times[0];
        String fastestParticipant = names[0];

        // Compare with the other times to find the minimum time
        for (int i = 1; i < times.length; i++) {
            if (times[i] < minTime) {
                minTime = times[i];
                fastestParticipant = names[i];
            }
        }

        // Output the participant with the highest average speed
        System.out.println(fastestParticipant + " had the highest average speed.");
    }
}
