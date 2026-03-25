import java.util.LinkedList;

class aaTrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==== UC4 - Train Ordering using LinkedList ====");

        // Step 1: Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Step 3: Insert Pantry at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter Inserting Pantry at position 2:");
        System.out.println(train);

        // Step 4: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        // Final Output
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        System.out.println("\nUC4 operations completed successfully...");
    }
}