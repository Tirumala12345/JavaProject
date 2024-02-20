public class CardProcessTest {
    public static void main(String[] args){
        CardProcessService processService=new CardProcessService();
        CardDetails cardDetails=new CardDetails();
        cardDetails.cardNumber="1234 1234 1234";
        cardDetails.pinNumber="1234";
        System.out.println(cardDetails.hashCode());
        boolean loginstatus=processService.login(cardDetails);
        CreditService creditService=new CreditService();
        if(loginstatus){
            int balance= creditService.credit("1234 1234 1234",100);
            System.out.println(balance);
            System.out.println("CreditService hashcode"+creditService.hashCode());
            int balance2= creditService.credit("1234 1234 1234",100);
            System.out.println("CreditService hashcode"+creditService.hashCode());
            System.out.println(balance2);

        }
    }
}
