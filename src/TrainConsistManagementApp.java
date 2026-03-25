import java.util.ArrayList;
import java.util.List;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial status
        System.out.println("Train Status: EMPTY");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Ready for further operations
        System.out.println("System Ready...");
    }
}