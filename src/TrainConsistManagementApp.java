import java.util.ArrayList;
import java.util.List;

class TrainConsistManagementApp {

    // Goods Bogie Class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("======================================\n");

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Step 2: Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // Step 3: Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Step 4: Display result
        if (isSafe) {
            System.out.println("\nTrain Status: SAFE");
        } else {
            System.out.println("\nTrain Status: UNSAFE");
        }

        System.out.println("\nUC12 validation completed...");
    }
}