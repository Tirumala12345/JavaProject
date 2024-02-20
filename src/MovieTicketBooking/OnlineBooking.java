package MovieTicketBooking;

public class OnlineBooking extends MovieTicket {
    private String bookingCode;

    public OnlineBooking(){
        super();

    }

    public OnlineBooking(String movieName, String theaterName, String showTime,  String bookingCode) {
        super(movieName, theaterName, showTime);
        this.bookingCode = "Tech Junkies";
    }


    public void displayTicket() {

        System.out.println("Booking Reference: " + bookingCode);
    }

}
