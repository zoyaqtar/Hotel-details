import java.util.Scanner;

class customer_info {
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
}

class HotelRoom extends customer_info {
    int floor;

    void read_floor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter floor number: ");
        this.floor = scanner.nextInt();
    }

    void display_room_info() {
        display_details();
        System.out.println("Floor: " + this.floor);
    }
}

public class room_det {
    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom();
        room1.read_details();
        room1.read_floor();
        room1.display_room_info();
    }
}
