package MovieTicketBooking;

public class LoginProcess {
    private  String validUsername = "1234 1234";
    private  String validPassword = "1234";

    public boolean login(String username, String password) {
        return username.equals(validUsername) && password.equals(validPassword);
    }
}
