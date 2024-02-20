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
//        ticketPrice =200*noOfSeats;
//        //System.out.println("No Of Seats: " + noOfSeats);
//        System.out.println("Total Ticket Price:" + ticketPrice);
        System.out.println("No Of Seats:" + noOfSeats);
        ticketPrice =200*noOfSeats;
        return ticketPrice;


    }

}
