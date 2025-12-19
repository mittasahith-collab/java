import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Food {
    String name;
    double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class RestaurantApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String restaurantName = "SHIVA'S RESTAURANT";
        String contactNumber = "+91 98765 43210";

        // -------- WELCOME --------
        System.out.println("========================================");
        System.out.println("   Welcome to " + restaurantName);
        System.out.println("   Contact: " + contactNumber);
        System.out.println("========================================");

        ArrayList<Food> menu = new ArrayList<>();
        menu.add(new Food("Veg Biryani", 120));
        menu.add(new Food("Chicken Biryani", 180));
        menu.add(new Food("Mutton Biryani", 250));
        menu.add(new Food("Paneer Butter Masala", 160));
        menu.add(new Food("Butter Naan", 40));
        menu.add(new Food("Chicken 65", 170));
        menu.add(new Food("Chilli Chicken", 180));
        menu.add(new Food("Coca Cola", 30));
        menu.add(new Food("Pepsi", 30));
        menu.add(new Food("Sprite", 30));
        menu.add(new Food("Mineral Water", 20));

        ArrayList<Food> orderList = new ArrayList<>();

        int choice = 1;
        sc.nextLine(); // buffer clear

        while (choice == 1) {

            System.out.println("\n------------- MENU -------------");
            System.out.println("ID\tFood Name\t\t\tPrice");

            for (int i = 0; i < menu.size(); i++) {
                System.out.printf("%d\t%-25s Rs. %.2f\n",
                        (i + 1), menu.get(i).name, menu.get(i).price);
            }

            System.out.print("\nEnter Food IDs (space separated): ");
            String input = sc.nextLine();
            String[] ids = input.split(" ");

            for (String id : ids) {
                int foodId = Integer.parseInt(id);
                if (foodId >= 1 && foodId <= menu.size()) {
                    orderList.add(menu.get(foodId - 1));
                    System.out.println("Added: " + menu.get(foodId - 1).name);
                }
            }

            System.out.print("\nOrder more? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer
        }

        // -------- DATE & TIME --------
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // -------- BILL --------
        System.out.println("\n=========== FINAL BILL ===========");
        System.out.println("Restaurant : " + restaurantName);
        System.out.println("Contact    : " + contactNumber);
        System.out.println("Date & Time: " + now.format(formatter));
        System.out.println("----------------------------------");

        double total = 0;
        for (Food food : orderList) {
            System.out.printf("%-25s Rs. %.2f\n", food.name, food.price);
            total += food.price;
        }

        double gst = total * 0.05;
        double discount = (total >= 500) ? total * 0.10 : 0;
        double finalAmount = total + gst - discount;

        System.out.println("----------------------------------");
        System.out.println("Subtotal    : Rs. " + total);
        System.out.println("GST (5%)    : Rs. " + gst);
        System.out.println("Discount    : Rs. " + discount);
        System.out.println("Total Pay   : Rs. " + finalAmount);

        // -------- THANK YOU --------
        System.out.println("\n========================================");
        System.out.println(" Thank You for Dining with Us 🙏");
        System.out.println(" Offer: 10% OFF on bills above Rs.500");
        System.out.println(" Visit Again 😊");
        System.out.println("========================================");

        sc.close();
    }
}
