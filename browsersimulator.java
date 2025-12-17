import java.util.Scanner;
import java.util.Stack;

public class browsersimulator {

    public static void main(String[] args) {
        Browser browser = new Browser();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Browser Navigation ---");
            System.out.println("1. Visit a new page");
            System.out.println("2. Go back");
            System.out.println("3. Go forward");
            System.out.println("4. Show current page");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL to visit: ");
                    String url = scanner.nextLine();
                    browser.visit(url);
                    break;
                case 2:
                    browser.goBack();
                    break;
                case 3:
                    browser.goForward();
                    break;
                case 4:
                    browser.currentPage();
                    break;
                case 5:
                    System.out.println("Exiting browser...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}

class Browser {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public Browser() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = "Home";
    }

    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visiting: " + url);
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Going back to: " + currentPage);
        } else {
            System.out.println("No previous page.");
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Going forward to: " + currentPage);
        } else {
            System.out.println("No next page.");
        }
    }

    public void currentPage() {
        System.out.println("Current page: " + currentPage);
    }
}