import java.util.HashSet;
import java.util.Set;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==== UC3 - Unique Bogie ID Management ====");

        // Step 1: Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add Bogie IDs (including duplicates)
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B2"); // duplicate
        bogieIds.add("B1"); // duplicate

        // Step 3: Display unique IDs
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nUC3 operations completed successfully...");
    }
}