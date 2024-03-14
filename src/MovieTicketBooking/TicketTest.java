package MovieTicketBooking;

public class TicketTest extends MovieTicket{
    public static void main(String[] args) {
        LoginProcess login = new LoginProcess();
        boolean user =login.login("1234 1234","1234");

        if (user==true) {
            System.out.println("Login Succesfull");


            MovieTicket movieTicket = new MovieTicket("Salaar", "Neoteric", "6:00 PM");
            System.out.println(movieTicket);

            Counterbooking ticket1 = new Counterbooking("Kushi", "Neoteric", "9:00 PM", 2);
            int cost = ticket1.displayTicket(3);
            System.out.println(cost);
            System.out.println(ticket1);

            MovieTicket ticket2 = new OnlineBooking("Game Changer", "Neoteric",
                    "7:00 PM", "Tech Junkies");
            System.out.println(ticket2);
            System.out.println(ticket2.getTheatreName());
        }else {
            System.out.println("Login Failed");
        }
    }

}

