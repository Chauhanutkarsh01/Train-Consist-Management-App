import java.util.ArrayList;
import java.util.List;

class TrainConsistManagementApp {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC10 - Total Seating Capacity");
        System.out.println("======================================\n");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Step 2: Display bogies
        System.out.println("Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // Step 3: map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 4: Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}