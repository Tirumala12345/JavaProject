package MovieTicketBooking;

public class MovieTicket {
    private String movieName;
    private String theatreName;
    private String showTime;





    public MovieTicket(String movieName,String theatreName,String showTime) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.showTime = showTime;
    }
    public MovieTicket(){

    }

    public String getMovieName() {
        return movieName;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public String getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "movieName='" + movieName + '\'' +
                ", theatreName='" + theatreName + '\'' +
                ", showTime='" + showTime + '\'' +
                '}';
    }
}


