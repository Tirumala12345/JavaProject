public class CardProcessService {

boolean login(CardDetails card){
    System.out.println(hashCode());
    String localcardNumber="1234 1234 1234";
    String localpinNumber="1234";

    if(localcardNumber.equals(card.cardNumber)  &&  localpinNumber.equals(card.pinNumber) ){
        return true;
    }else{
        return false;
    }
}
}
