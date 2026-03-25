import java.util.HashMap;
import java.util.Map;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==== UC6 - Bogie Capacity Mapping ====");

        // Step 1: Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Step 3: Display capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}