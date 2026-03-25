import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class TrainConsistManagementApp {

    // Bogie Class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==== UC7 - Sorting Bogies by Capacity ====");

        // Step 1: Create List
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // Step 3: Sort using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (By Capacity):");
        System.out.println(bogies);

        System.out.println("\nUC7 operations completed successfully...");
    }
}