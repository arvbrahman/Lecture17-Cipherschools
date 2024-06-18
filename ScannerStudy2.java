import java.util.Scanner;

public class ScannerStudy2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your First name: ");
        String firstName = sc.nextLine();
        System.out.print("Please enter your Last name: ");
        String lastName = sc.nextLine();
        System.out.print("Please enter your profession: ");
        String profession = sc.nextLine();
        System.out.print("Please enter your address: ");
        String address = sc.nextLine();
        System.out.print("Please enter your house number: ");
        int number = Integer.parseInt(sc.nextLine());

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
