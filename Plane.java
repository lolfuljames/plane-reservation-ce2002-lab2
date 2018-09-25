import java.util.*;
import java.lang.*;

public class Plane{
    public static final int SIZE = 12;
    private PlaneSeat[] seat = new PlaneSeat[SIZE];
    private PlaneSeat[] sortedSeats = new PlaneSeat[SIZE];
    private int numEmptySeat = SIZE;

    public Plane(){
        for(int i = 0; i < SIZE; i++){
            this.seat[i] = new PlaneSeat(i+1);
        }
    }

    private void sortSeats(){
        System.arraycopy(seat, 0, sortedSeats, 0, SIZE);
        QuickSort sorter = new QuickSort();
        sorter.sort(sortedSeats);
    }

    public void showEmptySeats(){
        System.out.println("The following seats are empty: ");
        for(int i = 0; i < SIZE; i++){
                if(seat[i].isOccupied() == false){
                    System.out.println("SeatID "+ this.seat[i].getSeatID());
                }
            }
    }

    public void showNumEmptySeats(){
        System.out.println("There are " + this.numEmptySeat + " empty seats");
    }

    public void showAssignedSeats(boolean bySeatID){
        if(numEmptySeat == SIZE){
            System.out.println("There are no assigned seats!");
            return;
        }
        System.out.println("The seat assignments are as follow:");
        int i;
        if(bySeatID){
            for(i = 0; i < SIZE;i++){
                if(seat[i].isOccupied() == true){
                    System.out.println("SeatID "+ seat[i].getSeatID() +" assigned to CustomerID " + seat[i].getCustomerID() + ".");
                }
            }
        } else{
            this.sortSeats();
            for(i = 0; i < SIZE;i++){
                if(sortedSeats[i].isOccupied() == true){
                    System.out.println("SeatID "+ sortedSeats[i].getSeatID() +" assigned to CustomerID " + sortedSeats[i].getCustomerID() + ".");
                }
            }
        }
    }

    public void assignSeat(int seatID, int cust_ID){
        seat[seatID-1].assign(cust_ID);
        if(numEmptySeat>0) numEmptySeat--; //no error checking is done due to the limitation of the question
    }

    public void unassignSeat(int seatID){
        seat[seatID-1].unassign();
        if(numEmptySeat<12) numEmptySeat++; //no error checking is done due to the limitation of the question
    }
}
