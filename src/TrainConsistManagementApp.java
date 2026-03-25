import java.util.ArrayList;
import java.util.List;

class TrainConsistManagementApp {

    static class Bogie {
        String id;
        String type;

        Bogie(String id, String type) {
            this.id = id;
            this.type = type;
        }

        @Override
        public String toString() {
            return type + "(" + id + ")";
        }
    }

    private static List<Bogie> passengerBogies = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("==== UC2 - Add Passenger Bogies to Train ====");

        // Add bogies
        addBogie("B1", "Sleeper");
        addBogie("B2", "AC Chair");
        addBogie("B3", "First Class");

        displayBogies("After Adding Bogies");

        // Remove bogie
        removeBogieByType("AC Chair");
        displayBogies("After Removing 'AC Chair'");

        // Check existence
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + containsType("Sleeper"));

        // Final state
        displayBogies("Final Train Passenger Consist");

        System.out.println("\nUC2 operations completed successfully...");
    }

    private static void addBogie(String id, String type) {
        // Prevent duplicate ID
        for (Bogie b : passengerBogies) {
            if (b.id.equals(id)) {
                System.out.println("Duplicate Bogie ID not allowed: " + id);
                return;
            }
        }
        passengerBogies.add(new Bogie(id, type));
    }

    private static void removeBogieByType(String type) {
        passengerBogies.removeIf(b -> b.type.equals(type));
    }

    private static boolean containsType(String type) {
        for (Bogie b : passengerBogies) {
            if (b.type.equals(type)) {
                return true;
            }
        }
        return false;
    }

    private static void displayBogies(String message) {
        System.out.println("\n" + message + ":");
        System.out.println(passengerBogies);
    }
}