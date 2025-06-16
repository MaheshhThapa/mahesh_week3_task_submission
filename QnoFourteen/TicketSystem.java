class Ticket {
    int ticketNumber;
    double price;

    Ticket(int ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    void generateTicket() {

    }
}

class BusTicket extends Ticket {
    int seatNumber;

    BusTicket(int ticketNumber, double price, int seatNumber){
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    void generateTicket() {
        System.out.println("Bus Ticket Number : " + ticketNumber);
        System.out.println("Price : Rs." + price);
        System.out.println("Seat Number : " + seatNumber);
    }
}

class TrainTicket extends Ticket {
    String coachType;

    TrainTicket(int ticketNumber, double price, String coachType){
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    @Override 
    void generateTicket() {
        System.out.println("Train Ticket Number : " + ticketNumber);
        System.out.println("Price : Rs." + price);
        System.out.println("Coach Type : " + coachType);
    }
}

class FlightTicket extends Ticket {
    String boardingGate;

    FlightTicket(int ticketNumber, double price, String boardingGate){
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override 
    void generateTicket() {
        System.out.println("Flight Ticket Number : " + ticketNumber);
        System.out.println("Price : Rs." + price);
        System.out.println("Boarding Gate : " + boardingGate);
    }
}
public class TicketSystem {
    public static void main(String[] args) {
        Ticket[] tic = new Ticket[3];
        tic[0] = new BusTicket(1011, 200, 4);
        tic[1] = new TrainTicket(232, 2000, "Standard");
        tic[2] = new FlightTicket(302, 20000, "1A");

        tic[0].generateTicket();
        System.out.println();
        tic[1].generateTicket();
        System.out.println();
        tic[2].generateTicket();
    }

    
}
