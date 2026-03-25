import java.util.LinkedHashSet;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==== UC5 - Ordered Unique Train Formation ====");

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Attempt duplicate insertion
        train.add("Sleeper"); // duplicate

        // Step 4: Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nUC5 operations completed successfully...");
    }
}