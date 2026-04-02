import java.util.Scanner;
import java.util.regex.Pattern;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("UC11 - Regex Validation (User Input)");
        System.out.println("======================================\n");

        // Step 1: Take input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Step 3: Validate using Pattern.matches
        boolean isTrainValid = Pattern.matches(trainRegex, trainId);
        boolean isCargoValid = Pattern.matches(cargoRegex, cargoCode);

        // Step 4: Output result
        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        System.out.println("\nUC11 validation completed...");

        sc.close();
    }
}