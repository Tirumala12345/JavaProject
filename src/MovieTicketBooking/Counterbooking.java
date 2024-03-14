package MovieTicketBooking;

public class Counterbooking extends MovieTicket{
    private int noOfSeats;

    public Counterbooking(String movieName, String theaterName, String showTime, int noOfSeats) {
        super(movieName, theaterName, showTime);
        this.noOfSeats = noOfSeats;
    }


    public int  displayTicket() {

        return noOfSeats;
    }
    public int  displayTicket(int ticketPrice) {
        System.out.println("No Of Seats:" + noOfSeats);
        ticketPrice =200*noOfSeats;
        return ticketPrice;


    }

}
