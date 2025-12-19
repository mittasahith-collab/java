import java.util.Scanner;

public class ResumeUpdated {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== RESUME BUILDER =====");

        // Contact Details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        // Summary
        System.out.print("Enter Summary: ");
        String summary = sc.nextLine();

        // Project Details
        System.out.print("Enter Project Name: ");
        String projectName = sc.nextLine();

        System.out.print("Enter Technologies Used in Project: ");
        String projectTech = sc.nextLine();

        // Certifications
        System.out.print("Enter Certifications: ");
        String certifications = sc.nextLine();

        // Resume Output
        System.out.println("\n=================================");
        System.out.println("              RESUME             ");
        System.out.println("=================================");

        System.out.println("CONTACT DETAILS");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Phone   : " + phone);

        System.out.println("\nSUMMARY");
        System.out.println(summary);

        System.out.println("\nPROJECT & TECHNOLOGIES");
        System.out.println("Project Name       : " + projectName);
        System.out.println("Technologies Used  : " + projectTech);

        System.out.println("\nCERTIFICATIONS");
        System.out.println(certifications);

        System.out.println("=================================");

        sc.close();
    }
}
