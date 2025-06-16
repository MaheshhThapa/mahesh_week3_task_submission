class Seat{
    private int seatNumber;

    Seat(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    void bookSeat() {
        System.out.println("Booking seat number :" + getSeatNumber());

    }
}

class RegularSeat extends Seat{

    RegularSeat(int seatNumber){
        super(seatNumber);
    }

    @Override
    void bookSeat() {
        System.out.println("Booking regular seat number :" + getSeatNumber());

    }
}

class PremiumSeat extends Seat {

    PremiumSeat(int seatNumber) {
        super(seatNumber);
    }

    @Override
    void bookSeat() {
        System.out.println("Premium seat " + getSeatNumber() + " booked successfully.");
        System.out.println("Snack charge: Rs. 500 ");
        System.out.println("Luxury tax: Rs. 500 ");
    }
}
public class TheaterBooking {
    public static void main(String[] args) {
        Seat reg = new RegularSeat(12);
        Seat pre = new PremiumSeat(5);

        reg.bookSeat();
        System.out.println();
        pre.bookSeat();

    }
}
