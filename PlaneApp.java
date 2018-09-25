import java.util.*;

public class PlaneApp{
    public static void main(String[] args){
        Plane AirAsia = new Plane();
        int choice;
        int seatID;
        int custID;
        while(true){
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.println("--------------------------------------");
            System.out.println("Enter the number of your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    AirAsia.showNumEmptySeats();
                    break;
                case 2:
                    AirAsia.showEmptySeats();
                    break;
                case 3:
                    AirAsia.showAssignedSeats(true);
                    break;
                case 4:
                    AirAsia.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat......");
                    System.out.println("Please enter SeatID: ");
                    seatID = sc.nextInt();
                    if(seatID>AirAsia.SIZE){
                        System.out.println("Invalid seat number!");
                        break;
                    }
                    System.out.println("Please enter Customer ID: ");
                    custID = sc.nextInt();
                    AirAsia.assignSeat(seatID,custID);
                    break;
                case 6:
                    System.out.println("Enter SeatID to unassign customer from: ");
                    seatID = sc.nextInt();
                    AirAsia.unassignSeat(seatID);
                    break;
                case 7:
                    System.out.println("Program terminating....");
                    return;
                default:
                    System.out.println("Invalid input!");
                    break;

            }
        }
	}
}