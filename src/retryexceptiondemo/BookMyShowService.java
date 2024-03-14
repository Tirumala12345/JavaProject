package retryexceptiondemo;

public class BookMyShowService {

    public void bookTicket() {
        SBIService sbiService = new SBIService();
        for (int i = 1; i <= 3; ) {
            try {
                sbiService.transfer();
                i=4;
            } catch (TimeOutException timeOutException) {
                System.out.println("Error Occured " + timeOutException);
                i=i+1;
            }catch (Exception e){
                i=4;
                System.out.println("Error Occured" +e);
            }
        }
    }
}
