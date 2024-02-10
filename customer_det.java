import java.util.Scanner;

public class customer_det {
    String name;
    String dob;
    int room_no;

    void read_details() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        this.name = scanner.next();
        System.out.print("Enter date of booking: ");
        this.dob = scanner.next();
        System.out.print("Enter room number: ");
        this.room_no = scanner.nextInt();
    }

    void display_details() {
        System.out.println("\nCustomer details:");
        System.out.println("Name: " + this.name);
        System.out.println("Date of booking: " + this.dob);
        System.out.println("Room number: " + this.room_no);
    }

    public static void main(String[] args) {
        customer_det c1 = new customer_det();
        c1.read_details();
        c1.display_details();
    }
}
