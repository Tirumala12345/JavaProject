package retryexceptiondemo;

public class BookMyShowProcess {

    public void bookTicket() {
        BookMyShowService bookMyShowService = new BookMyShowService();
        try {
            bookMyShowService.bookTicket();
        } catch (Exception e) {
            System.out.println("Error Occured " + e);
        }finally {
            System.out.println("bookticket finally exceuted");
        }
    }
}

