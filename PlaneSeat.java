import java.util.*;

public class PlaneSeat{
    private int seatID;
    private boolean assigned;
    private int customerID;

    public PlaneSeat(int seatID){
        this.seatID = seatID;
        this.assigned = false;
        this.customerID = 0;
    }

    public int getSeatID(){
        return this.seatID;
    }

    public int getCustomerID(){
        if(this.assigned){
            return this.customerID;
        }
        return -1;
    }

    public boolean isOccupied(){
        return this.assigned;
    }

    public void assign(int customerID){
        this.assigned = true;
        this.customerID = customerID;
        System.out.println("Seat assigned!");
    }

    public void unassign(){
        this.customerID=0;
        this.assigned=false;
        System.out.println("Seat unassigned!");
    }

}