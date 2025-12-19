import java.util.*;

public class UsernameGeneratorDSA {

    // Function to generate username using name + hashing + random number
    public static String generateUsername(String fullName) {

        // Remove extra spaces & split into words
        String[] parts = fullName.trim().split("\\s+");

        // Basic validation
        if (parts.length == 0) return "invalidname";

        // First name (required)
        String firstName = parts[0].toLowerCase();

        // Last name (if available)
        String lastName = (parts.length > 1) ? parts[parts.length - 1].toLowerCase() : "";

        // Create a hash code from the full name (DSA concept: hashing)
        int hash = Math.abs(fullName.hashCode());

        // Take last 3 digits of hash for uniqueness
        int uniqueNumber = hash % 1000;

        // Generate username
        return firstName + lastName + uniqueNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        String username = generateUsername(fullName);

        System.out.println("Generated Username: " + username);
    }
}
