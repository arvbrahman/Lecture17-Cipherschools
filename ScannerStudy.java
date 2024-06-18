import java.util.Scanner;
public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println("Please enter your profession: ");
        String profession = sc.next();
        System.out.println("Please enter your address: ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Please enter your house number: ");
        int number = sc.nextInt();

        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Profession: "+profession);
        System.out.println("Address: "+address);
        System.out.println("House number: "+number);

        // Whenever we need to take mixed inputs
            // 1. Number and Strings both are there
            // Words from a single then complete next line
            // --> use nextLine() and parse the data
    }
}
